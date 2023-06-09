package com.shop.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shop.project.dto.MemberDTO;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "hello";
	}
	
	@PostMapping("hello.do")
	public String test(MemberDTO dto) {
		
		return "hello2";
	}
}
