package com.clickbank.models;

/**
 * Created by riveramoreira on 7/16/16.
 */
public class WithoutString {
    private String answer;
    private String base;
    private String remove;

    public WithoutString(){}
    public WithoutString(String base, String remove){
        this.base =base;
        this.remove = remove;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }

}
