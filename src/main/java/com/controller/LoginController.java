package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.JsonResult;
import com.bean.UserBean;

@Controller
@RequestMapping(value="/user")
public class LoginController {
	
	
	@RequestMapping(value="/login",produces = {"application/json;charset=UTF-8"},method=RequestMethod.GET)
	 @ResponseBody
	public JsonResult login(@RequestParam("userName") String userName,
			                                  @RequestParam("pwd") String pwd,HttpServletRequest request){
		JsonResult jsonResult =new JsonResult<>();
		System.out.println("userName:"+userName+",,,,pwd:"+pwd);
		request.getSession().setAttribute("UserInfo", new UserBean(userName, pwd));
		
		return jsonResult;
	}
	
	
	@RequestMapping(value="/toLogin")
	public ModelAndView  toLogin(){
		return new ModelAndView("/login.html");
	}
}
