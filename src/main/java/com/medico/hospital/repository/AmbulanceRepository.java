package com.medico.hospital.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.medico.hospital.entity.Ambulance;

public interface AmbulanceRepository extends JpaRepository<Ambulance, Long> {
	   List<Ambulance> findByRegistrationNumber(String registrationNumber);

	    List<Ambulance> findByVin(String vin);

	    List<Ambulance> findByPhoneNumber(String phoneNumber);
	    List<Ambulance> findByRegistrationNumberAndVinAndPhoneNumber(
	            String registrationNumber, String vin, String phoneNumber);

		List<Ambulance> findByRegistrationNumberAndVin(String registrationNumber, String vin);

		List<Ambulance> findByRegistrationNumberAndPhoneNumber(String registrationNumber, String phoneNumber);

		List<Ambulance> findByVinAndPhoneNumber(String vin, String phoneNumber);


}

