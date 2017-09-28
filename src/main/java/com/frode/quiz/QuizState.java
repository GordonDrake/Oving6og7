package com.frode.quiz;

import com.frode.quiz.model.Quiz;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by FUH19 on 27-Sep-17.
 */

@Service
public class QuizState {

    public int idCounter;

    public Map<Integer, Quiz> quizzes;

    public QuizState() {
        idCounter = 0;
        quizzes = new HashMap<>();
    }
}
