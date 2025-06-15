package com.faksho.codeB_I1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User { // TODO ver como implementar esto con seguridad

    @Id @GeneratedValue
    private Long id;
}
