package com.kimtd.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class WebThymeleafApplication {

	@GetMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host","https://github.com/kim-space");
		return "index";
	}


	public static void main(String[] args) {
		SpringApplication.run(WebThymeleafApplication.class, args);
	}
}
