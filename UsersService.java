package com.example.MyDiary.Service;

import java.util.List;

import com.example.MyDiary.Entity.Users;

public interface UsersService {

	public Users saveUser(Users user);
	public Users updateUser(Users user);
	public void deleteUser(Users user);
	public Users findById(Long id);
	public List<Users> findAll();
	public Users findByUsername(String username);
	
}
