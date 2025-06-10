package com.faksho.codeB_I1.controller;

import com.faksho.codeB_I1.model.Stage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionsContoller {

    @GetMapping("/stages/getAll")
    public List<Stage> getStages() {

        List<Stage> stages = new ArrayList<>();
        stages.add(new Stage("Pregunta de prueba 1",
                new String[]{"Answ 1", "Answ 2"},
                1));

        stages.add(new Stage("Pregunta de prueba 2",
                new String[]{"Answ 1", "Answ 2"},
                0));

        return stages;
    }
}
