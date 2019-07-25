package com.visa.training.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes({"selectdBooks","selectedCars","selectedBikes"})
public class ShoppingCart {

	@RequestMapping(value="addBooks")
	
	public String handleAddBooks(@RequestParam("books")String[] books,Map model) {
		
		model.put("selectedBooks", books);
		return "car";
	}
	@RequestMapping(value="addCars")

public String handleAddCars(@RequestParam("car")String[] car,Map model) {
		
		model.put("selectedCars", car);
		return "bikes";
	}
	
	@RequestMapping(value="addBikes")
public String handleAddBikes(@RequestParam("bikes")String[] bikes,Map model) {
		
		model.put("selectedBikes", bikes);
		return "shoppingcartview";
	}

	
	
	
}
