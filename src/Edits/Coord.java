package Edits;

public class Coord {
    int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    public double editCoord(Coord enemyCoord) {return Math.sqrt(Math.pow(x - enemyCoord.x, 2) + Math.pow(y - enemyCoord.y, 2));}

    public Coord findSpace(Coord enemyCoord) {return new Coord(x - enemyCoord.x, y - enemyCoord.y);}

    public boolean equals(Coord enemy) {return x == enemy.x && y == enemy.y;}

    @Override
    public String toString() {return "(" + x + ", " + y + ")";}
}
