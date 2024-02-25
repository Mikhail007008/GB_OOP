package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Monk extends Unit {
    int ironPunch;

    public Monk(String name, Coord position) {
        super(name, 100, 100, 70, "Axe", 2, 70, 10, 0, position);
        ironPunch = 2;
    }

    @Override
    public void getHit(int damage) {
        health -= damage * ironPunch;
        rating += 10;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {

    }

    @Override
    public String toString() {
        return String.format("Unit: %s, Name: %s, Coord: %s", getClass().getSimpleName(), name, position);
    }
}
