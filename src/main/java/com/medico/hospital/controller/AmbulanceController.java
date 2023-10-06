package com.medico.hospital.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.medico.hospital.entity.Ambulance;
import com.medico.hospital.services.AmbulanceService;

@RestController
@RequestMapping("/api/ambulance")
public class AmbulanceController {
    private final AmbulanceService ambulanceService;

    @Autowired
    public AmbulanceController(AmbulanceService ambulanceService) {
        this.ambulanceService = ambulanceService;
    }

//    @PostMapping("/add")
//    public ResponseEntity<Ambulance> addAmbulance(@RequestBody Ambulance ambulance) {
//        Ambulance savedAmbulance = ambulanceService.addAmbulance(ambulance);
//        return ResponseEntity.ok(savedAmbulance);
//    }
    @PostMapping("/add")
    public ResponseEntity<Ambulance> addAmbulance(@RequestBody Ambulance ambulance) {
        Ambulance savedAmbulance = ambulanceService.addAmbulance(ambulance);
        if (savedAmbulance != null) {
            return ResponseEntity.ok(savedAmbulance);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Ambulance> updateAmbulance(
            @PathVariable Long id,
            @RequestBody Ambulance updatedAmbulanceRequest) { // Change the variable name here

        Ambulance updatedAmbulance = ambulanceService.updateAmbulance(id, updatedAmbulanceRequest);
        if (updatedAmbulance != null) {
            // Ambulance was successfully updated
            return ResponseEntity.ok(updatedAmbulance);
        } else {
            // Ambulance with the provided ID was not found
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/verify/{id}")
    public ResponseEntity<Ambulance> verifyAmbulance(@PathVariable Long id) {
        Ambulance verifiedAmbulance = ambulanceService.verifyAmbulance(id);
        if (verifiedAmbulance != null) {
            // Ambulance was successfully verified
            return ResponseEntity.ok(verifiedAmbulance);
        } else {
            // Ambulance with the provided ID was not found
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Ambulance>> searchAmbulances(
            @RequestParam(name = "registrationNumber", required = false) String registrationNumber,
            @RequestParam(name = "vin", required = false) String vin,
            @RequestParam(name = "phoneNumber", required = false) String phoneNumber) {

        List<Ambulance> searchResults = ambulanceService.searchAmbulances(registrationNumber, vin, phoneNumber);
        return ResponseEntity.ok(searchResults);
}
}

