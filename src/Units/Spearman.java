package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Spearman extends Unit{
    private int doubleBron;

    public Spearman(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 80, "spear", 0.5, 60, 20, 0, position, team);
        this.doubleBron = 20;
    }

    @Override
    public void getDam(int damage){
        damage += getRating() + getPower();
        setHealth(getHealth() - damage);
    }

    @Override
    public void atack(Unit opponent, int damage){
        opponent.getDam(damage);
        setRating(getRating() + 10);
    }

    @Override
    public String toString() {return String.format("Name: %s, Edits.Coord: %s", getName(), getPosition());}
}
