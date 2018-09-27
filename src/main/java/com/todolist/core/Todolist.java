package com.todolist.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Todolist {

	@ResponseBody
	@RequestMapping("/hello")
	private String Hello() {
		return "Hello";
	}
	
	@GetMapping("welcome")
	private String Welcome() {
		return "welcome";
	}
}
