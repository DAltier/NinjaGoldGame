package com.codingdojo.danaaltier.ninjaGoldGame.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
		}
		return "index.jsp";
	}

}
