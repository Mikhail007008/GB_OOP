package Units;

import Edits.Coord;

import java.util.ArrayList;

public class Arbalester extends Unit{
    int countArrow;

    public Arbalester(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100,100, 30, "Crossbow", 3, 20, 60, 0, position, team);
        countArrow = 10;
    }

    public void headShoot(){
        rating =+ 10;
    }

    @Override
    public Unit findEnemy() {
        Unit closestEnemy = null;
        double minDist = Double.MAX_VALUE;

        for (Unit enemy : team) {
            double dist = position.editCoord(enemy.position);
            if (dist < minDist && enemy.health > 0) {
                minDist = dist;
                closestEnemy = enemy;
                if (minDist < 3) {
                    power += 20;
                    headShoot();
                }else if (enemy.bron > 40 || minDist > 3) {
                    power -= 20;
                }
            } 
        }
        return closestEnemy;
    }

    @Override
    public void step() {
        if (health > 0 || countArrow > 0) {
            Unit enemy = findEnemy();
            if (enemy != null) {
                System.out.println("Ближайший враг: " + enemy.name);
                    enemy.getHit(power);
                    countArrow--;
            }else System.out.println("Отсутствуют враги в зоне видимости");
        }
    }

    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", name, position);}
}
