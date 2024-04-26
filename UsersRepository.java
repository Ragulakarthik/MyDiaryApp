package com.example.MyDiary.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyDiary.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	public Users findByUsername(String username);

}
