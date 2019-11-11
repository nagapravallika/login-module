package com.df.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.df.login.dao.LoginRepo;
import com.df.login.model.Login;

@Controller
public class LoginController 
{
	@Autowired
	LoginRepo repo;
	@RequestMapping("/login")
	public String loginhome()
	{
		return "loginhome.jsp";
	}
	
	@RequestMapping("/addLogin")
	public String addLogin(Login login)
	{
		repo.save(login);
		return "loginhome.jsp";
	}
}
