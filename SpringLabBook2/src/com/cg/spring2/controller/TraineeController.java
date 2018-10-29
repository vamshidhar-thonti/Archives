package com.cg.spring2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.spring2.dto.LoginDetails;
import com.cg.spring2.dto.TraineeDTO;
import com.cg.spring2.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	@RequestMapping(value = "home")
	public String Login(){
		return "LoginPage";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String Menu(@ModelAttribute("loginDetails") LoginDetails ld){
		if(ld.getUsername().equals("vamshi") && ld.getPassword().equals("vamshi")){
			return "Menu";
		}
		else
			return "Error";
	}
	
	@RequestMapping(value = "add")
	public String addList(@ModelAttribute("add1") TraineeDTO dto, Map<String, Object> model) {
		
		List<String> map = new ArrayList<String>();
		map.add("Please select");
		map.add("JAVA");
		map.add("JEE");
		map.add(".NET");
		model.put("domain", map);
		
		return "AddTrainee";
	}
	
	@RequestMapping(value = "adding", method = RequestMethod.POST)
	public String addData(@ModelAttribute("add1") TraineeDTO dto) {
		System.out.println("1");
		service.addTrainee(dto);
		return "Success";
	}

}
