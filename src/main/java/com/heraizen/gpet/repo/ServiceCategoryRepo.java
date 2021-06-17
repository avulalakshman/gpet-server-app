package com.heraizen.gpet.repo;

import com.heraizen.gpet.domain.ServiceCategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCategoryRepo extends JpaRepository<ServiceCategory,Long> {
    
}
