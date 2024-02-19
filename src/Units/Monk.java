package Units;
import java.util.ArrayList;

import Coord;

public class Monk extends Unit{
    private String ironPunch;

    public Monk(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 70, "Axe", 0.3, 70, 10, 0, position, team);
        this.ironPunch = ironPunch;
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
    public String toString() {return String.format("Name: %s, Coord: %s", getName(), getPosition());}
}
