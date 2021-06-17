package com.heraizen.gpet.domain;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.heraizen.gpet.config.JsonType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@TypeDef(name = "JsonbType", typeClass = JsonType.class)

public class ServiceCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String svcName;
    private String svcCode;
    private String description;
 
    @Column(columnDefinition = "jsonb")
    @Type(type = "JsonbType")
    private Map<String,Object> svcDetails;

}
