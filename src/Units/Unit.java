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

    public Unit(String name, int health, int maxHealth, int bron, String weapon, int speed, int power, int atackRange, int rating, Coord position) {
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
    }

    public String getName() {return name;}
    public int getHealth() {return health;}
    public int getSpeed() {return speed;}
    public Coord getPosition() {return position;}

    public void setName(String name) {this.name = name;}

    public Unit findEnemy(ArrayList<Unit> enemies) {
        if (enemies.isEmpty()) return null;

        Unit closestEnemy = null;
        double minDist = Double.MAX_VALUE;

        for (Unit enemy : enemies) {
            double dist = position.editCoord(enemy.position);
            if (dist < minDist && enemy.health > 0) {
                minDist = dist;
                closestEnemy = enemy;
            }
        }
        return closestEnemy;
    }

    public void getHit(int damage){
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }

    @Override
    public String toString() {
        return name + ", \u2665: " + health + ",  ⚔ : " + power + ", \uD83D\uDEE1\uFE0F :" + bron + ", Rating: " + rating;
    }

    public String getInfo(){
        return getClass().getSimpleName();
    };
}