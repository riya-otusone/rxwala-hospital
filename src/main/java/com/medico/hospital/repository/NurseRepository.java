package com.medico.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medico.hospital.entity.Nurse;

public interface NurseRepository extends JpaRepository<Nurse, Long> {
    
}

