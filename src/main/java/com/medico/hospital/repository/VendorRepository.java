package com.medico.hospital.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.medico.hospital.entity.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
    Optional<Vendor> findById(Long id); 

   
}
