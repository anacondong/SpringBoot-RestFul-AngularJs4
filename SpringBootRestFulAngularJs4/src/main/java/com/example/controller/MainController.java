/**
 * 
 */
package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ittipol
 *
 */
@Controller
public class MainController {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homeGet(Model model){
		return "index";
	}
	
}
