package com.faksho.codeB_I1.logic;

import com.faksho.codeB_I1.model.Stage;
import java.util.List;

public interface IStageActions {
    // TODO getAttatchment()
    Stage getStage(Long id);
    List<Stage> getAllStages();
    void createStage(String question,
                     List<String> possibleAnswers,
                     byte[] attachment,
                     int correctAnswerIndex);
    void createStage(Stage stage);


}
