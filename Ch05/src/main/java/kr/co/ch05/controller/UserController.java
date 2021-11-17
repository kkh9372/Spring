package kr.co.ch05.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ch05.service.UserService;
import kr.co.ch05.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<UserVO> users = service.selectUsers();
		
		// 스프링 model 객체를 이용해서 컴포넌트간 자료공유
		model.addAttribute("users", users);
		return "/user/list";
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserVO vo) {
		service.insertUser(vo);
		return "redirect:/user/register";
	}
	
	@GetMapping("/user/modify")
	public String modify(String uid, Model model) {
		UserVO user = service.selectUser(uid);
		model.addAttribute(user); // 객체명을 표기 안하면 소문자로 시작하는 객체타입
		return "/user/modify";
	}
	
	@PostMapping("/user/modify")
	public String modify(UserVO vo) {		
		service.updateUser(vo);		
		return "redirect:/user/list";
	}
	
	@GetMapping("/user/delete")
	public String delete(String uid) {
		service.deleteUser(uid);
		return "redirect:/user/list";
	}
}
