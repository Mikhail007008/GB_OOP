package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Monk extends Unit{
    int ironPunch;

    public Monk(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 70, "Axe", 2, 70, 10, 0, position, team);
        ironPunch = 2;
    }

    @Override
    public void getHit(float damage) {
        health -= (int)damage * ironPunch;
        rating += 10;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }

    @Override
    public void step() {
        
    }
 
    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", name, position);}
}
