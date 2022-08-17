package com.mb.api.business.service;

import java.util.List;
import com.mb.api.persistance.entity.User;
import com.mb.api.web.dto.SignupDto;

public interface UserService
{
	String saveUser(SignupDto signupDto);
	
	List<User> getAllUsers();

}
