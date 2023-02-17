package com.example.demo.repository;

import com.example.demo.entity.EpSmLicense;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpSmLicenseRepository extends R2dbcRepository<EpSmLicense,Long> {
    
}
