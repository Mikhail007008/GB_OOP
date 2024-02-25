package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Peasant extends Unit {
    int endurance;

    public Peasant(String name, Coord position) {
        super(name, 100, 100, 0, "Stick", 0, 10, 10, 0, position);
        endurance = 50;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health < 0) return;

        Unit target = findEnemy(enemy);

        if (target == null) return;

        if (position.editCoord(target.position) < 2) {
            System.out.println("Ближайший враг: " + target.name);
            target.getHit(power);
            return;
        }

        Coord space = position.findSpace(target.position);
        Coord newCoord = new Coord(this.position.getX(), this.position.getY());

        if (Math.abs(space.getX()) > Math.abs(space.getY())) {
            newCoord.setX(newCoord.getX() + (space.getX() < 0 ? 1 : -1));
        } else newCoord.setY(newCoord.getY() + (space.getY() < 0 ? 1 : -1));

        for (Unit unit : friend) {
            if (unit.position.equals(newCoord)) return;
        }

        this.position = newCoord;
    }

    @Override
    public String toString() {
        return String.format("Unit: %s, Name: %s, Coord: %s", getClass().getSimpleName(), name, position);
    }
}
