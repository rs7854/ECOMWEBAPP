package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
	
	@RequestMapping("/login")
	public String showLogin(Model m)
	{		
		m.addAttribute("pageinfo","Login");
		return "Login";
		}
	
	@RequestMapping("/register")
	public String showRegister(Model m)
	{		
		m.addAttribute("pageinfo","Login");
		return "Register";
		}

	@RequestMapping("/about us")
	public String showAboutUs(Model m)
	{		
		m.addAttribute("pageinfo","AboutUs");
		return "AboutUs";
		}

	@RequestMapping("/contact us")
	public String showContactUs(Model m)
	{		
		m.addAttribute("pageinfo","Login");
		return "ContactUs";
		}


}
