package com.nikhiljadav.spring_reactive.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "products")
public class Product {

    @Id
    private Long id;
    private String name;
    private Double price;
}
