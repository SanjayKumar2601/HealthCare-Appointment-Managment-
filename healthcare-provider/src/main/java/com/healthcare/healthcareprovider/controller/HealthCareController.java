package com.healthcare.healthcareprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.healthcareprovider.model.DoctorsAndAvailability;
import com.healthcare.healthcareprovider.service.HealthCareService;

@RestController
public class HealthCareController {
	
	@Autowired
	private HealthCareService service;
	
	@GetMapping(value = "/doctors", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DoctorsAndAvailability> getListOfDoctors()
	{
		return service.getListOfDoctorsAndAvailability();
	}
	
	@PostMapping(value = "/doctors", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String saveDoctor(@RequestBody DoctorsAndAvailability doctorsAvailability)
	{
		return service.saveDoctor(doctorsAvailability);
	}
	
}
