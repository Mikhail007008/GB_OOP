package Edits;

public class Coord {
    int x, y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double editCoord(Coord enemyCoord) {
        return Math.sqrt(Math.pow(x - enemyCoord.x, 2) + Math.pow(y - enemyCoord.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
