package com.faksho.codeB_I1.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String[] possibleAnswers;
    @Lob
    @Nullable
    private byte[] attachment;
    private int correctAnswerIndex;

    public Stage(String question, String[] possibleAnswers, @Nullable byte[] attachment, int correctAnswerIndex) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.attachment = attachment;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
