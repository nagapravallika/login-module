package com.df.login.dao;

import org.springframework.data.repository.CrudRepository;

import com.df.login.model.Login;

public interface LoginRepo extends CrudRepository<Login, Integer>
{
	

}
