package com.bitlabs.LibraryInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Modal.*;

public interface UserLoginInterface extends JpaRepository<UserLoginPage,Integer>{

}