package com.healthcare.authenticationservice.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import com.healthcare.authenticationservice.model.Model;
import com.healthcare.authenticationservice.model.PatientDetails;
import com.healthcare.authenticationservice.model.UserDetails;
@FeignClient(name="PATIENT-SERVICE",path = "/patient-service/patient")
public interface PatientFeign {
	 @PostMapping("/check-patient-exists")
    public Boolean checkPatientExists(@RequestBody UserDetails userDetails,@RequestHeader(value = "token",required = false)String token);
	 
	 @PostMapping("/schedule-appointments")
	  public ResponseEntity<Model> message(@RequestBody PatientDetails appointmentDetails,@RequestHeader(value = "token",required = false)String token);
}
