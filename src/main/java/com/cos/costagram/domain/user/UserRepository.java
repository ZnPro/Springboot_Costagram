package com.cos.costagram.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.costagram.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);

}
