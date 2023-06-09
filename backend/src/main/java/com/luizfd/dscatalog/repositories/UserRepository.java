package com.luizfd.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfd.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	
}
