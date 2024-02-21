package Units;
<<<<<<< HEAD

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
=======
import java.util.ArrayList;

import Coord;

public class Arbalester extends Unit{
    private int hiding;

    public Arbalester(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 30, "Crossbow", 0.7, 20, 60, 0, position, team);
        this.hiding = 50;
    }

    public void headShoot(){
        boolean headShoot = false;
        if(!headShoot){
            setRating(getRating() + 10);
        }
    }

    public void target(){
        Unit enemy = findEnemy();
        if (enemy != null) System.out.println("Ближайший враг: " + enemy.getName());
        else System.out.println("Отсутствуют враги в зоне видимости");
    }

    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", getName(), getPosition());}

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

//
>>>>>>> 08d1ffde9ed9158cc4c56f43906082b4fbd8d3ed
}
