package com.spring;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController{

	@Autowired
	private LoginModel loginModel;
	
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)  {
		
		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		boolean flag = loginModel.isValid(usr, pwd);
		if(flag) {
			return new ModelAndView("/welcome");
		}
		return new ModelAndView("/failure");
	}


	

}
