package com.heraizen.gpet.controller;


import java.util.List;

import com.heraizen.gpet.domain.ServiceCategory;
import com.heraizen.gpet.dto.ServiceCategoryDTO;
import com.heraizen.gpet.repo.ServiceCategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/scategory")
public class ServiceCategoryController {

        @Autowired
        private ServiceCategoryRepo serviceCategoryRepo;

        @GetMapping("/")
        public List<ServiceCategoryDTO> getServiceCategoriesDTO(){
            return serviceCategoryRepo.serviceCategoryDetails();
        }
        
        @GetMapping("/{cid}")
        public ServiceCategory getServiceCategory(@PathVariable("cid")Long id){
            return serviceCategoryRepo.findById(id).get();
        }

        @PostMapping("/add")
        public ServiceCategory addServiceCategory(@RequestBody ServiceCategory serviceCategory){
                return serviceCategoryRepo.save(serviceCategory);
        }

        @GetMapping("/all")
        public List<ServiceCategory> getServiceCategories(){
            return serviceCategoryRepo.findAll();
        }
       
}
