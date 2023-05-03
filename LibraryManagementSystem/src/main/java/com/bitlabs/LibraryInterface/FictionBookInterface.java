package com.bitlabs.LibraryInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Modal.*;

public interface FictionBookInterface extends JpaRepository<FictionBooks, Integer>{

}