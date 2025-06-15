package com.faksho.codeB_I1.model;

import com.faksho.codeB_I1.model.stages.Stage;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Response { // TODO verify this shit

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private User user;
    @ManyToOne
    private Stage stage;
    private Integer selectedAnswerIndex;
    private Double timeTookToAnswer;
    private boolean isCorrect;
}
