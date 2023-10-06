package com.medico.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medico.hospital.entity.Nurse;
import com.medico.hospital.repository.NurseRepository;

@Service
public class NurseService {
    private final NurseRepository nurseRepository;
  

    @Autowired
    public NurseService(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
    }

    public Nurse updateNurseProfile(Long nurseId, Nurse updatedNurse) {
        Nurse existingNurse = nurseRepository.findById(nurseId).orElse(null);
        if (existingNurse != null) {
        
            existingNurse.setLocation(updatedNurse.getLocation());
            existingNurse.setAvailability(updatedNurse.isAvailability());
            existingNurse.setPrice(updatedNurse.getPrice());
            existingNurse.setWaitingCharge(updatedNurse.getWaitingCharge());

            
            return nurseRepository.save(existingNurse);
        } else {
           
            return null;
        }
    }

    public Nurse addNurse(Nurse nurse) {
       
        Nurse newNurse = new Nurse();
        newNurse.setLocation(nurse.getLocation());
        newNurse.setAvailability(nurse.isAvailability());
        newNurse.setPrice(nurse.getPrice());
        newNurse.setWaitingCharge(nurse.getWaitingCharge());

        Nurse savedNurse = nurseRepository.save(newNurse);

      
        return savedNurse;
    }



}
