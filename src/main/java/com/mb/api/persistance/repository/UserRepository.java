package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	boolean existsByEmail(String email);
}
