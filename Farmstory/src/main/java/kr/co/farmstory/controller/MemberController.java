package kr.co.farmstory.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.co.farmstory.service.MemberService;
import kr.co.farmstory.vo.TermsVo;
import kr.co.farmstory.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	

	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/member/login")
	public String login(HttpSession sess, String uid, String pass) {
		
		MemberVo vo = service.selectMember(uid, pass);
		
		if(vo == null) {
			// 회원이 아닐 경우
			return "redirect:/member/login?success=100";
		}else {
			// 회원이 맞을 경우
			sess.setAttribute("sessMember", vo);
			return "redirect:/index?success=104";
		}
	}
	
	@GetMapping("/member/logout")
	public String logout(HttpSession sess) {
		// 현재 사용자 정보객체 세션삭제
		sess.invalidate();
		return "redirect:/";
	}

	@GetMapping("/member/terms")
	public String terms(Model model) {
		
		TermsVo vo = service.selectTerms();
		model.addAttribute(vo);
		
		return "/member/terms";
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@ResponseBody
	@GetMapping("/member/checkUid")
	public String checkUid(String uid) throws JsonProcessingException {
		
		System.out.println("uid : "+uid);		
		int result = service.selectCountUid(uid);
		
		// Gson 라이브러리로 json 생성
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("result", result);
		
		String strJson1 = new Gson().toJson(jsonObject);
		
		// Jackson 라이브러리로 json 생성  
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", result);
		
		String strJson2 = new ObjectMapper().writeValueAsString(resultMap);
		
		return strJson2;
	}
}




