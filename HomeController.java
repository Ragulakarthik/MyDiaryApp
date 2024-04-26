package com.example.MyDiary.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MyDiary.Entity.Entries;
import com.example.MyDiary.Entity.Users;
import com.example.MyDiary.Service.EntriesService;
import com.example.MyDiary.Service.UsersService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	HttpSession session;
	
	@Autowired
	private UsersService usersService;
	@Autowired
	private EntriesService entriesService;
	
	public EntriesService getEntriesService() {
		return entriesService;
	}
	public void setEntriesService(EntriesService entriesService) {
		this.entriesService = entriesService;
	}
	public UsersService getUsersService() {
		return usersService;
	}
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	@GetMapping("Login")
	public String loginPage() {
		return "Login";
	}
	@GetMapping("Register")
	public String registrationPage()
	{
		return "Register";
	}
	
	@PostMapping("saveUser")
	public String saveUser(@ModelAttribute("user") Users user) {
//		System.out.println(user.getUsername()+" "+user.getPassword());
		usersService.saveUser(user);
		return "Login";
	}
	
	@PostMapping("authen")
	public String authenuser(@ModelAttribute("user") Users user, Model model) {
		
		Users user1= usersService.findByUsername(user.getUsername());
		
		if(user1!=null && user.getPassword().equals(user1.getPassword())) {
			
			model.addAttribute("user",user1);
			session.setAttribute("user", user1);
			List<Entries> ent=null;
			
			try { 
				ent=entriesService.findByUserid(user1.getId());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("list", ent);
			return "Welcome";
		}
		return "Login";
	}
	
	@GetMapping("Welcome")
	public String welcomepage(Model model) {
		
		String viewname="Welcome";
		Users user1=(Users) session.getAttribute("user");
	
		if(user1==null) {
			return "Login";
		}
		List<Entries> ent=null;
		try {
			ent=entriesService.findByUserid(user1.getId());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("list",ent);
		return viewname;
	}
	
	@GetMapping("Addentry")
	public String addentry() {
		return "AddEntry";
	}
	
	@PostMapping("saveentry")
	public String saveentry(@ModelAttribute("entries") Entries entries, Model model) {
		
		entriesService.saveEntry(entries);
		Users user1=(Users)session.getAttribute("user");
		List<Entries> ent=null;
		try {
			ent=entriesService.findByUserid(user1.getId());
		}
		catch(Exception e) {
			e.printStackTrace();	
		}
		model.addAttribute("list", ent);
		return "Welcome";
	}
	
	@GetMapping("viewentry")
	public String viewentry(@RequestParam("id") long id, Model model) {
		Entries entries=entriesService.findById(id);
		model.addAttribute("ent", entries);
		return "ViewEntry";
	}
	
	@GetMapping("deleteentry")
	public String deleteentry(@RequestParam("id") long id, Model model) {
		
		Users user1=(Users)session.getAttribute("user");
		Entries entries=entriesService.findById(id);
		entriesService.deleteEntry(entries);
		List<Entries> ent=null;
		try {
			ent=entriesService.findByUserid(user1.getId());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("list", ent);
		return "Welcome";
	}
	
	@GetMapping("updateentry")
	public String updateentry(@RequestParam("id") long id,Model model) {
		
		Entries entries=entriesService.findById(id);
		model.addAttribute("list", entries);
		
		return "UpdateEntry";
	}
	
	@PostMapping("processentryupdate")
	public String processentryupdate(@ModelAttribute("entry") Entries entry, Model model)
	{
		entriesService.saveEntry(entry);
		
		Users user1=(Users)session.getAttribute("user");
		
		if(user1==null) {
			return "Login";
		}
		List<Entries> entries=null;
		try {
			entries=entriesService.findByUserid(user1.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("list", entries);
		
		return "Welcome";
	}
	
	@GetMapping("Logout")
	public String logout() {
		session.invalidate();
		return "Login";
	}
	
}
