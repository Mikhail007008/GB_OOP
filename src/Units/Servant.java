package Units;

import Edits.Coord;

import java.util.ArrayList;

abstract public class Servant extends Unit {
    int endurance;
    int arrow;
    public boolean isBusy;

    public Servant(String name, String weapon, Coord position) {
        super(name, 100, 100, 0, "knuckle", 0, 10, 10, 0, position);
        endurance = 50;
        arrow = 100;
        isBusy = false;
    }


    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health == 0) return;
        isBusy = false;
    }
}