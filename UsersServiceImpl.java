package com.example.MyDiary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyDiary.Entity.Users;
import com.example.MyDiary.Repositories.UsersRepository;


@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository userRepository;
	
	
	@Override
	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Users user) {
		userRepository.delete(user);
	}

	@Override
	public Users findById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<Users> findAll() {
		return userRepository.findAll();
	}
	
	public Users findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
