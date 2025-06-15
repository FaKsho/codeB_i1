package com.faksho.codeB_I1.logic;

import com.faksho.codeB_I1.model.stages.Stage;
import java.util.List;

public interface IStageActions {
    // TODO getAttatchment()
    Stage getStage(Long id);
    List<Stage> getAllStages();
    void createStage(String question,
                     List<String> possibleAnswers,
                     int correctAnswerIndex);
    void createStage(Stage stage);


}
