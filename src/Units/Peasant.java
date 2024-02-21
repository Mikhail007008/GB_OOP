package Units;
<<<<<<< HEAD

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
=======
import java.util.ArrayList;

import Coord;

public class Peasant extends Unit {
    private int endurance;

    public Peasant(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 0, "Stick", 0.6, 10, 10, 0, position, team);
        this.endurance = 50;
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
>>>>>>> 08d1ffde9ed9158cc4c56f43906082b4fbd8d3ed
}
