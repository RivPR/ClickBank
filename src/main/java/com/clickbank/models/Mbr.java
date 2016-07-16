package com.clickbank.models;

/**
 * Created by riveramoreira on 7/13/16.
 */
public class Mbr {

    private String answer;

    private int large, small;

    private String goal;

    public Mbr(){}

    public Mbr(int large, int small, String goal){
        this.large = large;
        this.small = small;
        this.goal = goal;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getLarge() {
        return large;
    }

    public void setLarge(int large) {
        this.large = large;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
