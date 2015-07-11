package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by carsonramsden on 7/7/15.
 */
public class Troll implements Monster {
    private String name;
    private int hitPoints;

    public Troll(){
        name = "Troll";
        hitPoints = 40;
    }

    @Override
    public void takeDamage(int amount){
        int damage = amount/2;
        hitPoints = hitPoints-damage;

    }
    public void reportStatus(){
        System.out.println(name + " has " + hitPoints + " points");
    }
}
