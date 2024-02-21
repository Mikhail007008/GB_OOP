package Units;
<<<<<<< HEAD

import Edits.Coord;

import java.util.ArrayList;

public class Monk extends Unit{
    int ironPunch;

    public Monk(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 70, "Axe", 2, 70, 10, 0, position, team);
        ironPunch = 2;
    }

    @Override
    public void getHit(float damage) {
        health -= (int)damage * ironPunch;
        rating += 10;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }

    @Override
    public void step() {
        
    }
 
    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", name, position);}
=======
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
>>>>>>> 08d1ffde9ed9158cc4c56f43906082b4fbd8d3ed
}
