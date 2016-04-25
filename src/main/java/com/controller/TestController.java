package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.JsonResult;
import com.bean.UserBean;

@Controller
@RequestMapping(value="/whc")
public class TestController {
	
	@RequestMapping(value="/test",produces = {"application/json;charset=UTF-8"},method=RequestMethod.GET)
	 @ResponseBody
	public JsonResult testMethod(){
		JsonResult<UserBean> jsonResult =new JsonResult<>();
		jsonResult.setDataObject(new UserBean("aaaa", "bbbb"));
		return jsonResult;
	}
	
}
