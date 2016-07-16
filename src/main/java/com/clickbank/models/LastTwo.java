package com.clickbank.models;

/**
 * Created by riveramoreira on 7/16/16.
 */
public class LastTwo {
    private String answer;

    public LastTwo(){}
    public LastTwo(String answer){
        this.answer = answer;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }
}
