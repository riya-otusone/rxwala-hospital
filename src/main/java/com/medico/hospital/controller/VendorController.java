package com.medico.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medico.hospital.entity.Vendor;
import com.medico.hospital.repository.VendorRepository;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
    private final VendorRepository vendorRepository;

    @Autowired
    public VendorController(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Vendor> getVendorById(@PathVariable Long id) {
        Optional<Vendor> vendor = vendorRepository.findById(id);

        if (vendor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(vendor.get());
    }


    
    @PostMapping
    public ResponseEntity<?> addVendor(@RequestBody Vendor vendor, BindingResult bindingResult) {
      
        if (vendor.getServiceName() == null || vendor.getServiceName().isEmpty()) {
            return ResponseEntity.badRequest().body("Service Name is required.");
        }
        
       
        if (vendor.getContactNumber() == null || vendor.getContactNumber().isEmpty()) {
            return ResponseEntity.badRequest().body("Contact Number is required.");
        }

   
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body("Validation error");
        }

       
        Vendor savedVendor = vendorRepository.save(vendor);
        return ResponseEntity.ok(savedVendor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vendor> updateVendor(@PathVariable Long id, @RequestBody Vendor updatedVendor) {
        Optional<Vendor> existingVendor = vendorRepository.findById(id);

        if (existingVendor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        if (updatedVendor.getServiceName() == null || updatedVendor.getServiceName().isEmpty()) {
            return ResponseEntity.badRequest().body(existingVendor.get()); // Return the existing vendor with a bad request
        }

        if (updatedVendor.getContactNumber() == null || updatedVendor.getContactNumber().isEmpty()) {
            return ResponseEntity.badRequest().body(existingVendor.get()); // Return the existing vendor with a bad request
        }

        updatedVendor.setId(id);
        Vendor savedVendor = vendorRepository.save(updatedVendor);

        return ResponseEntity.ok(savedVendor);
    }

}
