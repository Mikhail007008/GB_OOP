package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Spearman extends Unit{
    int doubleBron;

    public Spearman(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 80, "spear", 2, 60, 20, 0, position, team);
        doubleBron = 20;
    }
    
    @Override
    public void step() {
        
    }

    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", name, position);}
}
