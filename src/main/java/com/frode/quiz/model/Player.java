package com.frode.quiz.model;

/**
 * Created by FUH19 on 27-Sep-17.
 */
public class Player {
    private int id;
    static int playerCount = 0;
    private String nick;

    public Player(String nick){

        this.nick = nick.trim();
        playerCount ++;
        id = playerCount;
    }

    public String getNick(){return nick;}

    public int getId(){return id;}

    public Player fintPlayer(String nick){
        if(this.nick == nick)return this;
        else return null;
    }
}
