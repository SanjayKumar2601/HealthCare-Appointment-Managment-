package com.healthcare.healthcareprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.healthcareprovider.model.DoctorsAndAvailability;

@Repository
public interface HealthCareRepository extends JpaRepository<DoctorsAndAvailability, Integer> {


	}
