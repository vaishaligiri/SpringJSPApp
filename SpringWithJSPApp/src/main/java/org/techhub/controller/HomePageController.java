package org.techhub.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.techhub.dto.Register;
import org.techhub.service.RegisterService;

@Controller
public class HomePageController {

	@Autowired
	RegisterService registerService;

	@RequestMapping("/")
	public String homePage() {
		return "login";
	}

	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/saverecord")
	public String saveRecord(Register register, Map map) {
		boolean b = registerService.isRegister(register);
		if (b) {
			map.put("msg", "Registration Success...............");
		} else {
			map.put("msg", "Registration Failed....................");
		}
		return "register";
	}
}
