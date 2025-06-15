package com.faksho.codeB_I1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class GameSession {

    @Id @GeneratedValue
    private Long id;

    private Stage currentStage; // TODO necesito un handler a parte para cambiar esto

    private boolean acceptingAnswers; // TODO revisar esto, es una idea

    @OneToMany(mappedBy = "game")
    private List<Stage> stages;

}
