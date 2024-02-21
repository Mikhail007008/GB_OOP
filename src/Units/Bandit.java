package Units;
<<<<<<< HEAD

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
        
=======
import java.util.ArrayList;

import Coord;

public class Bandit extends Unit {
    private int agility;

    public Bandit(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 40, "Knife", 0.8, 40, 50, 0, position, team);
        this.agility = 30;
    }

    public void speedUp() {
        setSpeed(getSpeed() + 0.1);
>>>>>>> 08d1ffde9ed9158cc4c56f43906082b4fbd8d3ed
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return String.format("Name: %s, Coord: %s", name, position);
=======
        return String.format("Name: %s, Coord: %s", getName(), getPosition());
    }

    @Override
    public void getDam(int damage) {
        damage += getRating() + getPower();
        setHealth(getHealth() - damage);
    }

    @Override
    public void atack(Unit opponent, int damage) {
        opponent.getDam(damage);
        setRating(getRating() + 10);
>>>>>>> 08d1ffde9ed9158cc4c56f43906082b4fbd8d3ed
    }
}
