//package com.example.MyDiary.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.MyDiary.Entity.Entries;
//import com.example.MyDiary.Entity.Users;
//import com.example.MyDiary.Repositories.EntriesRepository;
//import com.example.MyDiary.Repositories.UsersRepository;
//import org.springframework.web.bind.annotation.PutMapping;
//
//@RestController
//public class PostmanController {
//	@Autowired
//	private UsersRepository usersRepository;
//	@Autowired
//	private EntriesRepository entriesRepository;
////	retrieve Users data operation
//	@GetMapping("/Users")
//	public List<Users> getUsersData() {
//		List<Users> users=usersRepository.findAll();
//		return users;
//	}
////	retrieve Entries data operation
//	@GetMapping("/Entries")
//	public List<Entries> getEntriesData() {
//		List<Entries> entries=entriesRepository.findAll();
//		return entries;
//	}
//	
////	retrieve Users using user id
//	@GetMapping("/Users/{id}")
//	public Users getByUserId(@PathVariable long id) {
//		Users user=usersRepository.findById(id).get();
//		return user;
//	}
////	retrieve all Entries using particular userid
//	@GetMapping("/Entries/{id}")
//	public List<Entries> getEntriesOfUserId(@PathVariable long id) {
//		List<Entries> entries=entriesRepository.findByUserid(id);
//		return entries;
//	}
//	//create new Users
//	@PostMapping("/Users/add")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public void newUser(@RequestBody Users user){
//		usersRepository.save(user);
//	}
////	create new Entries
//	@PostMapping("/Entries/add")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public void newuserentry(@RequestBody Entries entries) {		
//		entriesRepository.save(entries);
//	}
////	update users table
//	@PutMapping("Users/update/{id}")
//	public Users updateUsers(@PathVariable long id,@RequestBody Users updateduser) {
//		Users user=usersRepository.findById(id).get();
//		user.setUsername(updateduser.getUsername());
//		user.setPassword(updateduser.getPassword());
//		usersRepository.save(user);
//		return user;
//	}
////	update entries table
//	@PutMapping("Entries/update/{id}")
//	public Entries updateEntry(@PathVariable long id, @RequestBody Entries updatedentry) {
//		Entries entries=entriesRepository.findById(id).get();
//		entries.setEntrydate(updatedentry.getEntrydate());
//		entries.setDescription(updatedentry.getDescription());
//		entries.setUserid(updatedentry.getUserid());
//		entriesRepository.save(entries);
//		return entries;
//	}
////	delete users and his entries from table
//	@DeleteMapping("Users/delete/{id}")
//	public void deleteUsers(@PathVariable long id) {
//		Users user=usersRepository.findById(id).get();
//		usersRepository.delete(user);
//		List<Entries> entries=entriesRepository.findByUserid(id);
//		entriesRepository.deleteAll(entries);
//	}
////	delete entries from table
//	@DeleteMapping("Entries/delete/{id}")
//	public void deleteEntries(@PathVariable long id) {
//		Entries entries=entriesRepository.findById(id).get();
//		entriesRepository.delete(entries);
//	}
//}
