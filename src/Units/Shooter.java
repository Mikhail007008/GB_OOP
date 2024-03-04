package Units;

import Edits.Coord;
import Heroes.Farmer;

import java.util.ArrayList;

abstract public class Shooter extends Unit {
    int countСartridges;

    public Shooter(String name, String weapon, Coord position) {
        super(name, 100, 100, 30, weapon, 3, 20, 60, 0, position);
        countСartridges = 10;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health == 0 || countСartridges <= 0) return;

        Unit target = findEnemy(enemy);

        if (target != null) {
            target.getHit(power);
            for (Unit unit : friend) {
                if (unit.getInfo().equals("Farmer") && !((Farmer) unit).isBusy){
                    ((Farmer) unit).isBusy = true;
                    return;
                }
            }
            countСartridges--;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countСartridges;
    }
}