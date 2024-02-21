package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Mag extends Unit{

    int mana;

    public Mag(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 20, "Staff", 1, 10, 60, 0, position, team);
        mana = 30;
    }

    public void manaUp() {
        if(health < 10){
            mana += 50;
        }
    }
    
    @Override
    public void step() {
        
    }

    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", name, position);}

}
