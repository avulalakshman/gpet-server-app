package com.heraizen.gpet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.heraizen.gpet.domain.ServiceCategory;
import com.heraizen.gpet.dto.ServiceCategoryDTO;

public interface ServiceCategoryRepo extends JpaRepository<ServiceCategory,Long> {
    	
		@Query("SELECT new com.heraizen.gpet.dto.ServiceCategoryDTO(c.id,c.svcName,c.svcCode,c.description) from ServiceCategory c")
		public List<ServiceCategoryDTO> serviceCategoryDetails(); 
}
