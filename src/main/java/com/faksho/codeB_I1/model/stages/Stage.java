package com.faksho.codeB_I1.model.stages;

import com.faksho.codeB_I1.model.GameSession;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter @Getter
@Entity
// This makes creation of tables less bloated on the bbdd
@Inheritance(strategy = InheritanceType.JOINED)
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;

    @ElementCollection
    private List<String> possibleAnswers;

    private int correctAnswerIndex;

    @ManyToOne
    private GameSession gameSession;

    public Stage(String question, List<String> possibleAnswers, int correctAnswerIndex) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
