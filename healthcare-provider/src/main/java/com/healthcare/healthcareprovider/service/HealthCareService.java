package com.healthcare.healthcareprovider.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.healthcare.healthcareprovider.model.DoctorsAndAvailability;
import com.healthcare.healthcareprovider.repository.HealthCareRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HealthCareService {
	
	@Autowired
	private HealthCareRepository repo;
	
	
	//get the list of doctors availability
	public List<DoctorsAndAvailability> getListOfDoctorsAndAvailability()
	{
		List<DoctorsAndAvailability> listOfDoctors = repo.findAll();
		System.out.println(listOfDoctors.get(0).toString());
		return listOfDoctors;
	}
	
	//get the list of doctors availability
	@Transactional
	@Modifying
		public String saveDoctor(DoctorsAndAvailability doctorsAvailability)
		{		
		DoctorsAndAvailability doc =  repo.saveAndFlush(doctorsAvailability);
		if(doc!=null)
		{
			System.out.println("Record inserted for the doctor "+ " " + doctorsAvailability.getName()+ "with the date "+doctorsAvailability.getDate());
			return "success";
		}
		else
		{
			return "failure";
		}
		}

}
