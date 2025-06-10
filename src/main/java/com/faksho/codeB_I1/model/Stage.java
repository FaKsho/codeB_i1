package com.faksho.codeB_I1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

@Document(collection = "stages")
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Stage {

    private String question;
    private String[] possibleAnswers;
    private Object attachments;
    private int correctAnswerIndex;

    public Stage(String question, String[] possibleAnswers, int correctAnswerIndex) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
