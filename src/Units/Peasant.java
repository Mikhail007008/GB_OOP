package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Peasant extends Unit {
    int endurance;

    public Peasant(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 0, "Stick", 0, 10, 10, 0, position, team);
        endurance = 50;
    }

    @Override
    public void step() {
        
    }

    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", name, position);}
}
