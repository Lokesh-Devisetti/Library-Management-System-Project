package com.bitlabs.Service;
import com.bitlabs.Modal.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.LibraryInterface.UserLoginInterface;

@Service
public class UserDataService {

	@Autowired
	private UserLoginInterface userInte;
	
	public List<UserLoginPage> getAllUsers(){
		return this.userInte.findAll();
	}
}