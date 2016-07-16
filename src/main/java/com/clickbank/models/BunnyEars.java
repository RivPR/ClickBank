package com.clickbank.models;

/**
 * Created by riveramoreira on 7/16/16.
 */
public class BunnyEars {

    private String answer;

    private int bunnies;

    public BunnyEars(){}

    public BunnyEars(int bunnies, String answer){
        this.bunnies = bunnies;
        this.answer = answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }
}
