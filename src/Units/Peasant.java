package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Peasant extends Unit {
    int endurance;

    public Peasant(String name, Coord position) {
        super(name, 100, 100, 0, "Stick", 0, 10, 10, 0, position);
        endurance = 50;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        
    }

    @Override
    public String toString() {
        return String.format("Unit: %s, Name: %s, Coord: %s", getClass().getSimpleName(), name, position);
    }
}
