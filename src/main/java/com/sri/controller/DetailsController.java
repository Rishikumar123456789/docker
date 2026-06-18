package com.sri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sri.model.Detils;
import com.sri.service.DetailsService;

@RestController
public class DetailsController {
    @Autowired
    public DetailsService detailsService;
	@PostMapping("/saveDetails")
	public Detils saveDetails(@RequestBody Detils details) {
		
		return detailsService.saveDetails(details);
	}

	@GetMapping("/getAllDetails")
	public List<Detils> getAllDetails() {
		return detailsService.getAllDetails();
	    }

	@GetMapping("/getDetailsById/{Id}")
	public Detils getDetailsById(Long Id) {
		return detailsService.getDetailsById(Id);
	}
}
