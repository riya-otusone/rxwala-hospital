package com.medico.hospital.controller;

import com.medico.hospital.entity.StoreManager;
import com.medico.hospital.repository.StoreManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/store-managers")

public class StoreManagerController {
    private final StoreManagerRepository storeManagerRepository;

    @Autowired
    public StoreManagerController(StoreManagerRepository storeManagerRepository) {
        this.storeManagerRepository = storeManagerRepository;
    }

    @PostMapping
    public ResponseEntity<StoreManager> addStoreManager(@RequestBody StoreManager storeManager) {
        StoreManager savedStoreManager = storeManagerRepository.save(storeManager);
        return ResponseEntity.ok(savedStoreManager);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<StoreManager> updateStoreManager(@PathVariable Long id, @RequestBody StoreManager updatedStoreManager) {
        Optional<StoreManager> existingStoreManager = storeManagerRepository.findById(id);

        if (existingStoreManager.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

       
        StoreManager storeManagerToUpdate = existingStoreManager.get();
        storeManagerToUpdate.setStoreOwner(updatedStoreManager.getStoreOwner());
        storeManagerToUpdate.setOwnerAddress(updatedStoreManager.getOwnerAddress());
        storeManagerToUpdate.setOwnerContact(updatedStoreManager.getOwnerContact());
        storeManagerToUpdate.setEmailId(updatedStoreManager.getEmailId());
        storeManagerToUpdate.setType(updatedStoreManager.getType()); 

      
        StoreManager savedStoreManager = storeManagerRepository.save(storeManagerToUpdate);

        return ResponseEntity.ok(savedStoreManager);
    }
}
