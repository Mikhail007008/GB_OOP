package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Spearman extends Unit {
    int doubleBron;

    public Spearman(String name, Coord position) {
        super(name, 100, 100, 80, "spear", 2, 60, 20, 0, position);
        doubleBron = 20;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {

    }

    @Override
    public String toString() {
        return String.format("Unit: %s, Name: %s, Coord: %s", getClass().getSimpleName(), name, position);
    }
}
