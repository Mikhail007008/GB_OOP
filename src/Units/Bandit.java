package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Bandit extends Unit {
    int agility;

    public Bandit(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 40, "Knife", 2, 40, 50, 0, position, team);
        agility = 30;
    }

    public void speedUp() {speed++;}
    
    @Override
    public void step() {
        
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Coord: %s", name, position);
    }
}
