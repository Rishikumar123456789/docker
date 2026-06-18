package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.model.Detils;
import com.sri.repo.DetilsRepo;
@Service
public class DetailsService implements DetilsInterface {
    @Autowired
    public DetilsRepo detilsRepo;
	@Override
	public Detils saveDetails(Detils details) {
		
		return detilsRepo.save(details);
	}

	@Override
	public List<Detils> getAllDetails() {
	    return detilsRepo.findAll();
	    }

	@Override
	public Detils getDetailsById(Long Id) {
		return detilsRepo.findById(Id).get();
	}

}
