package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Pikeman extends Unit {
    int doubleBron;

    public Pikeman(String name, Coord position) {
        super(name, 100, 100, 80, "spear", 2, 60, 20, 0, position);
        doubleBron = 20;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0) return;

        Unit target = super.findEnemy(enemy);

        if (position.editCoord(target.position) < 2) {
            target.getHit(power);
            return;
        }

        Coord space = position.findSpace(target.position);

        if (Math.abs(space.getX()) > Math.abs(space.getY())) {
            this.position.setX(this.position.getX() + (space.getX() < 0 ? 1 : -1));
        } else this.position.setY(this.position.getY() + (space.getY() < 0 ? 1 : -1));
    }
}