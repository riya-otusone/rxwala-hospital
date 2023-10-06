package com.medico.hospital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medico.hospital.entity.Store;
import com.medico.hospital.repository.StoreRepository;

@RestController
@RequestMapping("/api/stores")
public class StoreController {
    private final StoreRepository storeRepository;

    @Autowired
    public StoreController(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<Store> addStore(@RequestBody Store store) {
       
        Store savedStore = storeRepository.save(store);
        return ResponseEntity.ok(savedStore);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Store> updateStore(@PathVariable Long id, @RequestBody Store updatedStore) {
        Optional<Store> existingStore = storeRepository.findById(id);

        if (existingStore.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        updatedStore.setId(id); 
        Store savedStore = storeRepository.save(updatedStore);

        return ResponseEntity.ok(savedStore);
    }
}
