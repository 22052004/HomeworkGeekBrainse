package ru.gb.java.lisson7;

public class Plate{
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void increaseFood(int food){
        this.food += food;
    }
    public void decreaseFood(int appetite){
        food = food - appetite;
    }
    public boolean hasEnoughFood(int appetite){
        return appetite <= food;
    }
}


