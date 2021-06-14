package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
public String callSwaggerUI() {
	return "redirect:/swagger-ui.html";
}

}
