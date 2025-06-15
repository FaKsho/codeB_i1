package com.faksho.codeB_I1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Response {

    @Id
    @GeneratedValue
    private Long id;
}
