package com.healthcare.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
	
	@Bean
	public RouteLocator customRouter(RouteLocatorBuilder builder)
	{
		return builder.routes().
				route(authenticationRoute->authenticationRoute.path("/authenticate/**").uri("lb://AUTHENTICATION-SERVICE")).
				route(patientRoute->patientRoute.path("/patient/**").uri("lb://PATIENT-SERVICE")).
				route(appointmentRoute->appointmentRoute.path("/appointment/**").uri("lb://APPOINTMENT-SERVICE")).
				route(healthcareproviderRoute->healthcareproviderRoute.path("/doctors/**").uri("lb://HEALTHCARE-PROVIDER-SERVICE")).build();
	}

}
