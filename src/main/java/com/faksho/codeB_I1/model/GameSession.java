package com.faksho.codeB_I1.model;

import com.faksho.codeB_I1.model.stages.Stage;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class GameSession {

    @Id @GeneratedValue
    private Long id;

    @OneToOne
    private Stage currentStage; // TODO handler needed to change this

    private boolean acceptingAnswers; // TODO check this out

    @OneToMany(mappedBy = "gameSession")
    private List<Stage> stages;

}
