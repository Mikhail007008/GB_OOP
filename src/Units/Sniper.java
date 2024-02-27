package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Sniper extends Unit {
    int countPatron;

    public Sniper(String name, Coord position) {
        super(name, 100, 100, 30, "Gun", 3, 20, 100, 0, position);
        countPatron = 10;
    }

    public void headShoot() {
        boolean headShoot = false;
        if (!headShoot) rating += 10;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0 || countPatron <= 0) return;

        Unit target = findEnemy(enemy);

        if (target != null) {
            target.getHit(power);
            countPatron--;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countPatron;
    }
}