package com.bitlabs.Controller;

import java.util.List;
import com.bitlabs.Modal.*;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitlabs.Service.UserDataService;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class UserDataController {

	@Autowired
	private UserDataService userService;
	
	@GetMapping("/loginForm")
    public String loginForm() {
    	
       
        return "login";
    }
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
	    
	    request.getSession().invalidate();
	    
	    return "redirect:/loginForm";
	}
    
   
    
    @PostMapping("/logIntoSystem")
    public String logIntoSystem(@RequestParam("email") String email, @RequestParam("psd") String pass,Model modal) {
    	
    	List<com.bitlabs.Modal.UserLoginPage> users=userService.getAllUsers();
    	
    	for(com.bitlabs.Modal.UserLoginPage u: users) {
    		
    		if(u.getEmailId().equalsIgnoreCase(email) && u.getPassword().equalsIgnoreCase(pass)) {
    			return "HomePage";
    		}
    	}
    	
    	modal.addAttribute("Status","Invalid user name and password");
    	return "login";
    }
    
    
    @GetMapping("/home")
    public String home() {
    	System.out.println("Home method called");
       
        return "index";
    }
}