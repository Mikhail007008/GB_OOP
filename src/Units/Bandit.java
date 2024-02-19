package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Bandit extends Unit {
    private int agility;

    public Bandit(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 40, "Knife", 0.8, 40, 50, 0, position, team);
        this.agility = 30;
    }

    public void speedUp() {
        setSpeed(getSpeed() + 0.1);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Edits.Coord: %s", getName(), getPosition());
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
    }
}
