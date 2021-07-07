package com.heraizen.gpet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceCategoryDTO {
	    private Long id;
	    private String svcName;
	    private String svcCode;
	    private String description;
}
