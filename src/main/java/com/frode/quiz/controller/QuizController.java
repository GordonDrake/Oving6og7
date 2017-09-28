package com.frode.quiz.controller;

import com.frode.quiz.QuizState;
import com.frode.quiz.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by FUH19 on 27-Sep-17.
 */

@Controller
public class QuizController {

    @Autowired
    private QuizState state;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/ny")
    public String getNy() {
        return "ny";
    }

    @GetMapping("/question")
    public String getQuestion(Map<String, Object> model, @RequestParam("quizid") String id, @RequestParam("quizname") String name) {
        model.put("quizname", name);
        model.put("quizid", id);
        return "question";
    }

    @GetMapping("/quiz")
    public String getQuiz(Map<String, Object> model) {
        model.put("quiz_ids", state.quizzes.entrySet().stream().map(Map.Entry::getKey).toArray());
        return "quiz";
    }

    @GetMapping("/join/{quizId}")
    public String join(Map<String, Object> model, @PathVariable("quizId") String quizId) {
        Quiz q = state.quizzes.get(Integer.parseInt(quizId));
        model.put("quiz", q);
        return "join";
    }

    @GetMapping("/score")
    public String getScore() {
        return "score";
    }
}
