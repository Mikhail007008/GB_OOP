package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Farmer extends Unit {
    int endurance;

    public Farmer(String name, Coord position) {
        super(name, 100, 100, 0, "Stick", 0, 10, 10, 0, position);
        endurance = 50;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {

    }
}