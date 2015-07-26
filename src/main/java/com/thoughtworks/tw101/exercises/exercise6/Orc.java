package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by carsonramsden on 7/7/15.
 */
public class Orc implements Monster {
    private String name;
    private int hitPoints;

    public Orc(){
        name = "Orc";
        hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints = hitPoints - amount;
    }

    @Override
    public void reportStatus(){
        System.out.println(name + " has " + hitPoints + " points");
    }
}
