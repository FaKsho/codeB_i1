package com.faksho.codeB_I1.model.stages;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class MediaStage extends Stage{ // Example class for testing

    @Nullable
    private byte[] attachment;

    public MediaStage(String question, List<String> possibleAnswers, int correctAnswerIndex,
                      @Nullable byte[] attachment) {

        super(question, possibleAnswers, correctAnswerIndex);
        this.attachment = attachment;
    }
}
