package com.svenwasell.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.svenwasell.dojosandninjas.models.Dojo;
import com.svenwasell.dojosandninjas.models.Ninja;
import com.svenwasell.dojosandninjas.services.DojoServices;
import com.svenwasell.dojosandninjas.services.NinjaServices;

@Controller
public class MainController {
	
	@Autowired
	DojoServices dojoServices;
	@Autowired
	NinjaServices ninjaServices;
	
	
//	--- Index ---
	
	@GetMapping("/")
	public String dashboard() {
		return "redirect:/dojo";
	}
	
//	--- Dojo --- 
	
	@GetMapping("/dojo")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";	
	}
	
	@PostMapping("/dojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, Model dojoModel) {
		
		dojoServices.createDojo(dojo);
		dojoModel.addAttribute("dojo", dojo);
		
		return "redirect:/ninjas";

	}

//	--- Ninja ---
	
	@GetMapping("/ninjas")
	public String ninja(@ModelAttribute("ninja") Ninja ninja, Model dojoModel) {
		
		List<Dojo> dojos = dojoServices.allDojos();
		dojoModel.addAttribute("dojo", dojos); 
		return "ninja.jsp";
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Model ninjaModel) {
		Ninja ninjas = ninjaServices.createNinja(ninja);
		ninjaModel.addAttribute("ninja", ninjas);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
//	--- Show --- 
	
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable Long id, Model dojoModel) {
	    
	    Dojo dojos = dojoServices.findById(id);
	    dojoModel.addAttribute("dojo", dojos);
	    
	    return "show.jsp";
	}

	
	
}
