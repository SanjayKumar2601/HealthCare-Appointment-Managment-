package com.healthcare.authenticationservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.healthcare.authenticationservice.exception.UserNotValidException;
import com.healthcare.authenticationservice.feign.PatientFeign;
import com.healthcare.authenticationservice.model.PatientDetails;
import com.healthcare.authenticationservice.model.UserDetails;
import com.healthcare.authenticationservice.utils.JwtUtil;
import com.healthcare.authenticationservice.model.Model;
@RestController
public class AuthenticationController {
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	private PatientFeign patient;
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody UserDetails user )
	{
		String token = null;
		//user present in patient table,generate the token
		if(patient.checkPatientExists(user,null)) {
			token = jwtUtil.generateToken(user);
			
		}
		else
		{
			//user not present,throw error
			throw new UserNotValidException();
		}
		return token;
	}
	@PostMapping("/authenticate/book-appointment")
	public ResponseEntity<Model> bookappointment(@RequestBody PatientDetails patientdetails)
	{
		UserDetails userdetails = new UserDetails();
		userdetails.setName(patientdetails.getPatientUsername());
		userdetails.setPassword(patientdetails.getPassword());
		String token = null;
		//user present in patient table,generate the token
		if(patient.checkPatientExists(userdetails,null)) {
			token = jwtUtil.generateToken(userdetails);
			System.out.println(token);
			if(token!=null) {
				 return patient.message(patientdetails,token);
			}
		}
		else
		{
			//user not present,throw error
			throw new UserNotValidException();
		}
		return null;
		
	}
}
