package com.sunrise.member.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sunrise.member.service.MemberService;
import com.sunrise.member.vo.MemberVO;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService mService;
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String getJoin() throws Exception{
		return "/member/join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String postJoin(MemberVO memberVO, RedirectAttributes rttr) throws Exception{
		mService.memberInsert(memberVO);

		rttr.addFlashAttribute("msg", "가입이 완료되었습니다.");
		return "redirect:list";
	}
	
	@RequestMapping(value = "idCnt", method = RequestMethod.POST)
	public String idCnt(@RequestBody String filterJSON, HttpServletResponse response, ModelMap model) throws Exception{
		JSONObject resMap= new JSONObject();
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
