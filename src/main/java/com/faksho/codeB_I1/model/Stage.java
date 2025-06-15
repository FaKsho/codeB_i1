package com.faksho.codeB_I1.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;

    @ElementCollection
    private List<String> possibleAnswers;

    @Lob
    @Nullable
    private byte[] attachment;

    private int correctAnswerIndex;

    public Stage(String question, List<String> possibleAnswers, @Nullable byte[] attachment, int correctAnswerIndex) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.attachment = attachment;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
