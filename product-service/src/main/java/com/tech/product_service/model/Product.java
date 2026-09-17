package com.tech.product_service.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "product")
@AllArgsConstructor 
@NoArgsConstructor
@Builder 
@Data 
public class Product {
    
    private String id;
    private String name;
    private String description;
    private long price;

}
