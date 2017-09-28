package com.frode.quiz.model; /**
 * Created by FUH19 on 26-Sep-17.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    static int MAX_ALTERNATIVES = 4;
    static int tid = 15; //i sekunder

    //private ArrayList<String> question = new ArrayList<>();
    private int correctAnswer;
    private String question;
    private String[] answers;

    public String[] getAnswers() {
        return answers;
    }

    //private int nbAlt = 0;

    public Question(String[] string, int answer){
        System.out.println(Arrays.toString(string));
        System.out.println(answer);
        if(string.length == 0 || string.length > MAX_ALTERNATIVES+1){
            throw new IllegalArgumentException("The String[] has an invalid length!");
        }
        question = string[0];

        answers = new String[4];
        System.arraycopy(string, 1, answers, 0, answers.length);
        /*
        for(String s: answers){
            if(s != null) question.add(s.trim());

            correctAnswer = answer;
        }
        */
    }
    public int getMaxAlternatives(){return MAX_ALTERNATIVES;}
    public String getQuestion(){return question;}
    /*
    public boolean addAlternative(String alternative){
        if(nbAlt >= alternatives.length){
            return false;
        } else {
            alternatives[nbAlt] = alternative;
            nbAlt ++;
        }
    }
    */
//    public boolean editAlternative(int index, String text){
//        if(index != 0 && index < question.size()){
//            question.set(index, text);
//            return true;
//        } else return false;
//    }
}
