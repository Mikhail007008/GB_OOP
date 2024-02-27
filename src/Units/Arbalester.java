package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Arbalester extends Unit {
    int countArrow;

    public Arbalester(String name, Coord position) {
        super(name, 100, 100, 30, "Crossbow", 3, 20, 60, 0, position);
        countArrow = 10;
    }

    public void headShoot() {
        rating += 10;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0 || countArrow <= 0) return;

        Unit target = findEnemy(enemy);
        if (target != null) {
            target.getHit(this.power);
            countArrow--;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countArrow;
    }
}