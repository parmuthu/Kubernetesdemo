package com.training.kubernetes.kubernetesdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/show")
	public String showMessage()
	{
		return "Welcome";
	}
}
