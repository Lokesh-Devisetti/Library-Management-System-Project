package com.bitlabs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.Modal.ChildrenBooks;
import com.bitlabs.Modal.FictionBooks;
import com.bitlabs.Modal.NonFictionBooks;
import com.bitlabs.Modal.YouthBooks;
import com.bitlabs.Service.BookDataService;

@Controller
public class BookDataController {
    
	@Autowired
	private  BookDataService bookService;
	@RequestMapping("/ChildrenBooks")
	@ResponseBody
	public ModelAndView getAllChild(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<ChildrenBooks> books = bookService.getAllChildBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("ChildrenBooks");
        return modelAndView;
				
				
	}
	@RequestMapping("/FictionBooks")
	@ResponseBody
	public ModelAndView getAllFictional(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<FictionBooks> books = bookService.getAllFictionBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("FictionBooks");
        return modelAndView;
				
				
	}
	@RequestMapping("/NonFictionBooks")
	@ResponseBody
	public ModelAndView getAllNonFictional(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<NonFictionBooks> books = bookService.getAllNonFictionBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("NonFictionBooks");
        return modelAndView;
				
				
	}
	
	@RequestMapping("/YouthBooks")
	@ResponseBody
	public ModelAndView getAllYouth() {
        ModelAndView modelAndView = new ModelAndView();
        List<YouthBooks> books = bookService.getAllYouthBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("YouthBooks");
        return modelAndView;
    }
    
    
    
    
    
}

