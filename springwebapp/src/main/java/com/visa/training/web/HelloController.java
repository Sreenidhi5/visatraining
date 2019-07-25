package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
@RequestMapping("/hello") //to map the methods to url

	public ModelAndView helloWorld(@RequestParam("name")String name) {
	
	String result ="Hello" +name;
	String viewName ="helloview";
	Map<String,Object> attribute=new HashMap<>();
	attribute.put("result",result);
	
	return new ModelAndView(viewName,attribute);
	
	
		
		
	}
	
	
	
}
