package com.mb.api.web.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mb.api.business.service.UserService;
import com.mb.api.persistance.entity.User;
import com.mb.api.web.dto.SignupDto;
import static com.mb.api.constant.UrlMapping.USER;

@RestController
@CrossOrigin("http://localhost:4200/")
public class UserController extends BaseController
{
	@Autowired
	private UserService userService;

	// @PostMapping("/user")

	@PostMapping(USER)
	public ResponseEntity<String> saveUser(@RequestBody @Valid SignupDto signupDto)
	{
		String responseMessage = userService.saveUser(signupDto);
		return new ResponseEntity<>(responseMessage, HttpStatus.OK);
	}

	@GetMapping(USER)
	public ResponseEntity<List<User>> getAllUsers()
	{

		List<User> users = userService.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}
