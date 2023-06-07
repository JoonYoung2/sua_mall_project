package com.shop.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shop.project.dto.MemberDTO;
import com.shop.project.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	private MemberService service;
	
	
	@GetMapping("/")
	public String home() {
		return "hello";
	}
	
	@PostMapping("hello.do")
	public String test(MemberDTO dto) {
		service.insert(dto);
		return "hello2";
	}
}
