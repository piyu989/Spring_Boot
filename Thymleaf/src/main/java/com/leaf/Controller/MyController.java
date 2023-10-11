package com.leaf.Controller;

import java.util.Date;
import java.util.List;

//import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	@GetMapping(value="/about")
	public String about(Model model) {
		System.out.println("Inside about method");
		model.addAttribute("name","Piyush");
		model.addAttribute("todayDate",new Date().toLocaleString());
		
		return "about";
	}
	
	@GetMapping(value="/iterate")
	public String iterateHandle(Model m) {
		
		List<String> names=List.of("Ganesh ji","Ram ji","krishna ji","vishnu ji");
		m.addAttribute("names",names);
		
		return "iterate";
	}
	
	@GetMapping(value="/condition")
	public String conditionHandle(Model m) {
		
		m.addAttribute("isActive",true);
		m.addAttribute("m","m");
		return "condition";
	}
}
