package com.faksho.codeB_I1.logic;

import com.faksho.codeB_I1.model.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageActions implements IStageActions{

    @Autowired IStageRepository stageRepo;

    @Override
    public void createStage(String question,
                            List<String> possibleAnswers,
                            byte[] attachment,
                            int correctAnswerIndex) {

        Stage st = new Stage(question,
                possibleAnswers,
                attachment,
                correctAnswerIndex);

        stageRepo.save(st);
    }

    @Override
    public void createStage(Stage st) {
        stageRepo.save(st);
    }

    @Override
    public Stage getStage(Long id) {
        return stageRepo.findById(id).orElse(null);
    }

    @Override
    public List<Stage> getAllStages() {
        return stageRepo.findAll();
    }
}
