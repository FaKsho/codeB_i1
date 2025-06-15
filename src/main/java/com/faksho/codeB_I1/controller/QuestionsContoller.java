package com.faksho.codeB_I1.controller;

import com.faksho.codeB_I1.logic.IStageActions;
import com.faksho.codeB_I1.model.stages.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionsContoller {

    @Autowired
    IStageActions stageActions;

    @PostMapping("/stages/create")
    public void createStage(@RequestBody Stage stage) {
        stageActions.createStage(stage);
    }

    @GetMapping("/stages/getAll")
    public List<Stage> getStages() {

        return stageActions.getAllStages();
    }

    @GetMapping("/stages/get")
    public Stage getStage(@RequestParam Long id) {

        return stageActions.getStage(id);
    }
}
