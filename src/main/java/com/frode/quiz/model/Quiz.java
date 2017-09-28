package com.frode.quiz.model;

/**
 * Created by FUH19 on 26-Sep-17.
 */
import java.util.ArrayList;

public class Quiz {

    private static int idCounter = 0;

    private final int id;
    private ArrayList<Question> questions = new ArrayList<>();
    private final String name;

    public Quiz(String name){
        this.name = name.trim();
        idCounter++;
        id = idCounter;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getId(){return id;}

    public String getName() {
        return name;
    }

    public void addQuestion(String[] q, int a){
        /*
        com.frode.quiz.Question[] temp = new com.frode.quiz.Question[questions.length+1];
        for(int i = 0; i < questions.length; i++){
            temp[i] = questions[i];
        }
        temp[questions.size()] = new com.frode.quiz.Question(q);
        */
        questions.add(new Question(q, a));
    }

    public boolean removeQuestion(int index){
        boolean ok = false;
        return ok;
    }

    public boolean changeQuestion(int index, String q){
        boolean ok = false;
        if(q == null || q.trim().isEmpty()){
            return false;
        } else {
            Question x = questions.get(index);
        }
        return ok;
    }


}
