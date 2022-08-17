package com.mb.api.web.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupDto
{
	@NotBlank
	@Size(max=50, message = "Max 50 characters are allowed")
	private String firstName;
	
	@NotBlank
	@Size(max=50, message = "Max 50 characters are allowed")
	private String lastName;
	
	@Email(message="please enter valid email address")
	private String email;
	
	@NotBlank
	@Size(min=8, message="Password should contains atleast 8 characters")
	private String password;

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPassword()
	{
		return password;
	}
	
}
