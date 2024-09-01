package com.nikhiljadav.spring_reactive_webclient.models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Double price;
}
