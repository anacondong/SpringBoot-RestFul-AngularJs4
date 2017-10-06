package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Rule;
import com.example.service.RuleService;

@RestController
public class WebRestController {

	@Autowired
	RuleService ruleService;
	
	@RequestMapping("/api/rule")
	public List<Rule> hi() {
		return ruleService.findAll();
	}
}