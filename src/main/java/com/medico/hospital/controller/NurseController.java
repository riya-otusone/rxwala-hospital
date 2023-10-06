package com.medico.hospital.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.medico.hospital.entity.Nurse;
import com.medico.hospital.services.NurseService;
@RestController
@RequestMapping("/api/nurse")
public class NurseController {
    private final NurseService nurseService;

    @Autowired
    public NurseController(NurseService nurseService) {
        this.nurseService = nurseService;
    }

    @PostMapping("/add") 
    public ResponseEntity<Nurse> addNurse(@RequestBody Nurse nurse) {
        Nurse savedNurse = nurseService.addNurse(nurse); 
        if (savedNurse != null) {
           
            return ResponseEntity.ok(savedNurse);
        } else {
            
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Nurse> updateNurseProfile(
            @PathVariable Long id,
            @RequestBody Nurse updatedNurse) {

        Nurse updatedProfile = nurseService.updateNurseProfile(id, updatedNurse);
        if (updatedProfile != null) {
         
            return ResponseEntity.ok(updatedProfile);
        } else {
           
            return ResponseEntity.notFound().build();
        }
    }
}
