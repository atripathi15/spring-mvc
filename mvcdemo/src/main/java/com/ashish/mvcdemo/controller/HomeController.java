package com.ashish.mvcdemo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response, HttpSession session) throws IOException{
		session.setAttribute("userName", "xyz@1234567");
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/test")
	public ModelAndView test2(HttpServletResponse response, HttpSession session) throws IOException{
		String userName = (String) session.getAttribute("userName");
		return new ModelAndView("home");
	}
}
