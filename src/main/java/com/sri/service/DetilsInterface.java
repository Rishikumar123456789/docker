package com.sri.service;

import java.util.List;

import com.sri.model.Detils;

public interface DetilsInterface {
public Detils saveDetails(Detils details);
public List<Detils> getAllDetails();
public Detils getDetailsById(Long Id);
}
