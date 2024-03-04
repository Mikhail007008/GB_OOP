package Units;

import Edits.Coord;

import java.util.ArrayList;

abstract public class Warrior extends Unit {
    int agility;

    public Warrior(String name, String weapon, Coord position) {
        super(name, 100, 100, 40, weapon, 2, 40, 50, 0, position);
        agility = 30;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health == 0) return;

        Unit target = findEnemy(enemy);

        if (target == null) return;

        if (position.editCoord(target.position) < 2) {
            target.getHit(power);
            return;
        }

        Coord space = position.findSpace(target.position);
        Coord newCoord = new Coord(position.getX(), position.getY());

        if (Math.abs(space.getX()) > Math.abs(space.getY())) {
            newCoord.setX(newCoord.getX() + (space.getX() < 0 ? 1 : -1));
        } else newCoord.setY(newCoord.getY() + (space.getY() < 0 ? 1 : -1));

        for (Unit unit : friend) {
            if (unit.position.equals(newCoord) && unit.health > 0) return;
        }

        position = newCoord;
    }
}