package Units;
import java.util.ArrayList;

import Coord;
import MyInterface;

abstract class Unit implements MyInterface {
    private String name;
    private int health;
    private int bron;
    private String weapon;
    private double speed;
    private int power;
    private int atackRange;
    private int rating;
    protected Coord position;
    protected ArrayList<Unit> team;

    protected Unit(String name, int health, int bron, String weapon, double speed, int power, int atackRange, int rating, Coord position, ArrayList<Unit> team) {
        this.name = name;
        this.health = health;
        this.bron = bron;
        this.weapon = weapon;
        this.speed = speed;
        this.power = power;
        this.atackRange = atackRange;
        this.rating = rating;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {return health;}
    public double getSpeed() {return speed;}
    public int getAtackRange() {return atackRange;}
    public int getRating() {return rating;}
    public int getBron() {return bron;}
    public int getPower() {return power;}
    public Coord getPosition() {
        return position;
    }

    public void setName(String name) {this.name = name;}
    public void setHealth(int health) {this.health = health;}
    public void setBron(int bron) {this.bron = bron;}
    public void setWeapon(String weapon) {this.weapon = weapon;}
    public void setSpeed(double speed) {this.speed = speed;}
    public void setPower(int power) {this.power = power;}
    public void setAtackRange(int atackRange) {this.atackRange = atackRange;}
    public void setRating(int rating) {this.rating = rating;}

    public Unit findEnemy() {
        Unit closestEnemy = null;
        double minDist = Double.MAX_VALUE;

        for (Unit enemy : team) {
            double dist = position.editCoord(enemy.getPosition());
            if (dist < minDist) {
                minDist = dist;
                closestEnemy = enemy;
            }
        }
        return closestEnemy;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Health: %d Bron: %d Weapon: %s Speed: %f Power: %d AtackRange: %d Position: %s", this.name, this.health, this.bron, this.weapon, this.speed,
                this.power, this.atackRange, this.position);
    }
}