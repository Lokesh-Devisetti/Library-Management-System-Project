package com.bitlabs.Service;

import com.bitlabs.Modal.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.LibraryInterface.ChildrenBookInterface;
import com.bitlabs.LibraryInterface.FictionBookInterface;
import com.bitlabs.LibraryInterface.NonFictionBookInterface;
import com.bitlabs.LibraryInterface.YouthBookInterface;

@Service
public class BookDataService {

	@Autowired
	private ChildrenBookInterface childInte;
	
	@Autowired
	private FictionBookInterface fictionInte;
	@Autowired
	private NonFictionBookInterface nonFictionInte;
	@Autowired
	private YouthBookInterface youthBookInte;
	
	public List<ChildrenBooks> getAllChildBooks(){
		return this.childInte.findAll();
	}
	
	public List<FictionBooks> getAllFictionBooks(){
		
		return this.fictionInte.findAll();
	}
	public List<NonFictionBooks> getAllNonFictionBooks(){
		return this.nonFictionInte.findAll();
	}
	
	public List<YouthBooks> getAllYouthBooks(){
		return this.youthBookInte.findAll();
	}
}