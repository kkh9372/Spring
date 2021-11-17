package kr.co.ch08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	@GetMapping("/customer/list")
	public String list() {
		return "/customer/list";
	}
	
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
	
	@GetMapping("/customer/modify")
	public String modify() {
		return "/customer/modify";
	}
}
