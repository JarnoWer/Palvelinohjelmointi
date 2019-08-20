package com.example.demo.week1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "firstname", required = false, defaultValue = "You") String firstName, 
            @RequestParam(name ="location", required = false, defaultValue = "There") String location) {
	return "Welcome to the " + location + " " + firstName + "!"; 
	}
}