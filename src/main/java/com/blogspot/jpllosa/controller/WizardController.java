package com.blogspot.jpllosa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.blogspot.jpllosa.model.Questionaire;

@Controller
public class WizardController {

	@GetMapping("/wizard")
	public String wizardForm() {
		return "wizard";
	}
	
	@GetMapping("/success")
	public String successPage() {
		return "success";
	}
	
	@PostMapping("/wizard")
	public ResponseEntity<String> wizardSubmit(@ModelAttribute Questionaire questionaire) {
		System.out.println(questionaire);
		return new ResponseEntity<>("", 
				HttpStatus.OK);
	}
}
