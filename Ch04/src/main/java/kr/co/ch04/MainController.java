package kr.co.ch04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = {"/", "/hello"}, method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting";
	}
}


