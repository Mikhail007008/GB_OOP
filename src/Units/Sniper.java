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
    public Unit findEnemy(ArrayList<Unit> enemies) {
        if (enemies.isEmpty()) return null;

        Unit closestEnemy = null;
        double minDist = Double.MAX_VALUE;

        for (Unit enemy : enemies) {
            double dist = position.editCoord(enemy.position);
            if (dist < minDist && enemy.health > 0) {
                minDist = dist;
                closestEnemy = enemy;

                if (minDist < 3) {
                    power += 20;
                    headShoot();
                } else if (enemy.bron > 40 || minDist > 3) {
                    power -= 20;
                }
            }
        }
        return closestEnemy;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health < 0 || countPatron < 0) return;

        Unit target = findEnemy(enemy);

        if (target != null) {
            System.out.println("Ближайший враг: " + target.name);
            target.getHit(power);
            countPatron--;
        } else System.out.println("Отсутствуют враги в зоне видимости");
    }

    @Override
    public String toString() {
        return String.format("Unit: %s, Name: %s, Coord: %s", getClass().getSimpleName(), name, position);
    }
}
