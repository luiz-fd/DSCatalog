package com.luizfd.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfd.dscatalog.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByAuthority(String authority);

}
