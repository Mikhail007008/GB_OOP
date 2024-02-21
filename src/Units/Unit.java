package Units;

import Edits.Coord;
import Edits.MyInterface;

import java.util.ArrayList;

abstract public class Unit implements MyInterface {
    String name;
    int health;
    int maxHealth;
    int bron;
    String weapon;
    int speed;
    int power;
    int atackRange;
    int rating;
    Coord position;
    ArrayList<Unit> team;

    public Unit(String name, int health, int maxHealth, int bron, String weapon, int speed, int power, int atackRange, int rating, Coord position, ArrayList<Unit> team) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.bron = bron;
        this.weapon = weapon;
        this.speed = speed;
        this.power = power;
        this.atackRange = atackRange;
        this.rating = rating;
        this.position = position;
        this.team = team;
    }

    public String getName() {return name;}
    public int getHealth() {return health;}
    public int getSpeed() {return speed;}
    public int getAtackRange() {return atackRange;}
    public int getRating() {return rating;}
    public int getBron() {return bron;}
    public int getPower() {return power;}
    public Coord getPosition() {return position;}
    public int getMaxHealth() {return maxHealth;}

    public void setName(String name) {this.name = name;}
    public void setHealth(int health) {this.health = health;}
    public void setBron(int bron) {this.bron = bron;}
    public void setWeapon(String weapon) {this.weapon = weapon;}
    public void setSpeed(int speed) {this.speed = speed;}
    public void setPower(int power) {this.power = power;}
    public void setAtackRange(int atackRange) {this.atackRange = atackRange;}
    public void setRating(int rating) {this.rating = rating;}
    public void setMaxHealth(int maxHealth) {this.maxHealth = maxHealth;}

    public Unit findEnemy() {
        Unit closestEnemy = null;
        double minDist = Double.MAX_VALUE;

        for (Unit enemy : team) {
            double dist = position.editCoord(enemy.position);
            if (dist < minDist && enemy.health > 0) {
                minDist = dist;
                closestEnemy = enemy;
            }
        }
        return closestEnemy;
    }

    public void getHit(float damage){
        health -= (int)damage;
        rating += 10;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Health: %d Bron: %d Weapon: %s Speed: %d Power: %d AtackRange: %d Position: %s", this.name, this.health, this.bron, this.weapon, this.speed,
                this.power, this.atackRange, this.position);
    }
}