package com.medico.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.medico.hospital.entity.Ambulance;
import com.medico.hospital.repository.AmbulanceRepository;

@Service
public class AmbulanceService {
    private final AmbulanceRepository ambulanceRepository;

    @Autowired
    public AmbulanceService(AmbulanceRepository ambulanceRepository) {
        this.ambulanceRepository = ambulanceRepository;
    }

    public Ambulance addAmbulance(Ambulance ambulance) {
        return ambulanceRepository.save(ambulance);
    }

    public Ambulance verifyAmbulance(Long id) {
       return ambulanceRepository.findById(id).orElse(null);
    }
    public Ambulance updateAmbulance(Long ambulanceId, Ambulance updatedAmbulance) {
        Ambulance existingAmbulance = ambulanceRepository.findById(ambulanceId).orElse(null);
        if (existingAmbulance != null) {
         
            existingAmbulance.setRegistrationNumber(updatedAmbulance.getRegistrationNumber());
            existingAmbulance.setVin(updatedAmbulance.getVin());
            existingAmbulance.setPhoneNumber(updatedAmbulance.getPhoneNumber());
            existingAmbulance.setDateOfRegistration(updatedAmbulance.getDateOfRegistration());
            existingAmbulance.setLocation(updatedAmbulance.getLocation());
            existingAmbulance.setAvailability(updatedAmbulance.isAvailability());
            existingAmbulance.setPrice(updatedAmbulance.getPrice());
            existingAmbulance.setWaitingCharge(updatedAmbulance.getWaitingCharge());

      
            return ambulanceRepository.save(existingAmbulance);
        } else {
            // Ambulance with the provided ID was not found
            return null;
        }
    }

    public List<Ambulance> searchAmbulances(String registrationNumber, String vin, String phoneNumber) {
        
        if (registrationNumber != null && vin != null && phoneNumber != null) {
            return ambulanceRepository.findByRegistrationNumberAndVinAndPhoneNumber(
                    registrationNumber, vin, phoneNumber);
        } else if (registrationNumber != null && vin != null) {
            return ambulanceRepository.findByRegistrationNumberAndVin(
                    registrationNumber, vin);
        } else if (registrationNumber != null && phoneNumber != null) {
            return ambulanceRepository.findByRegistrationNumberAndPhoneNumber(
                    registrationNumber, phoneNumber);
        } else if (vin != null && phoneNumber != null) {
            return ambulanceRepository.findByVinAndPhoneNumber(vin, phoneNumber);
        } else if (registrationNumber != null) {
            return ambulanceRepository.findByRegistrationNumber(registrationNumber);
        } else if (vin != null) {
            return ambulanceRepository.findByVin(vin);
        } else if (phoneNumber != null) {
            return ambulanceRepository.findByPhoneNumber(phoneNumber);
        } else {
            
            return ambulanceRepository.findAll();
        }
    }
}
