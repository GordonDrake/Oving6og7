package com.frode.quiz.controller;

import com.frode.quiz.QuizState;
import com.frode.quiz.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FUH19 on 27-Sep-17.
 */

@RestController
public class QuizDataController {

    @Autowired
    private QuizState state;

    @PostMapping("/question")
    public int getData(@RequestParam("q1_text") String q1_text,
                       @RequestParam("q1_a1") String q1_a1,
                       @RequestParam("q1_a2") String q1_a2,
                       @RequestParam("q1_a3") String q1_a3,
                       @RequestParam("q1_a4") String q1_a4,
                       @RequestParam("q1_ca") String q1_ca,
                       @RequestParam(value = "quizId") String quizId) {
        Quiz q = state.quizzes.get(Integer.parseInt(quizId));

        String[] s = {q1_text, q1_a1, q1_a2, q1_a3, q1_a4};
        int a = Integer.parseInt(q1_ca);
        q.addQuestion(s, a);
        return q.getId();
    }

    @PostMapping("/ny")
    public Quiz newQuiz(@RequestBody String name) {
        Quiz q = new Quiz(name);
        state.quizzes.put(q.getId(), q);
        return q;
    }
}
