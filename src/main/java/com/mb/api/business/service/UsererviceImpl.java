package com.mb.api.business.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mb.api.business.exception.CustomException;
import com.mb.api.constant.ErrorCode;
import com.mb.api.persistance.entity.User;
import com.mb.api.persistance.repository.UserRepository;
import com.mb.api.web.dto.SignupDto;

@Service
public class UsererviceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public String saveUser(SignupDto signupDto)
	{
		
		if(userRepository.existsByEmail(signupDto.getEmail())) {
			throw new CustomException("User Already exists with Email " + signupDto.getEmail(), ErrorCode.USER_ALREADY_EXITS);
		}	
		
		User user = mapper.map(signupDto, User.class);
		try
		{
			userRepository.save(user);
		}
		catch (Exception e)
		{
			throw new CustomException("Unable register user, try Again!", ErrorCode.INTERNAL_SERVER_ERROR);
		}
		
		return "User register successfully !";
	}

	@Override
	public List<User> getAllUsers()
	{
		
		try
		{
			return userRepository.findAll();
		}
		catch (Exception e)
		{
			throw new CustomException("Unable Fetched Users Data", ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}


}
