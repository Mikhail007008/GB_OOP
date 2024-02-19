import java.util.ArrayList;
import java.util.Random;

import Units.Arbalester;
import Units.Bandit;
import Units.Mag;
import Units.Monk;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;
import Units.Unit;

public class Main {

    public static void main(String[] args) {
        ArrayList<Unit> teamOne = new ArrayList<>();
        ArrayList<Unit> teamTwo = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(7)) {
                case 0:
                    teamOne.add(new Mag(getName(), new Coord(i, 0), teamTwo));
                    break;
                case 1:
                    teamOne.add(new Arbalester(getName(), new Coord(i, 0), teamTwo));
                    break;
                case 2:
                    teamOne.add(new Bandit(getName(), new Coord(i, 0), teamTwo));
                    break;
                case 3:
                    teamOne.add(new Monk(getName(), new Coord(i, 0), teamTwo));
                    break;
                case 4:
                    teamOne.add(new Peasant(getName(), new Coord(i, 0), teamTwo));
                    break;
                case 5:
                    teamOne.add(new Sniper(getName(), new Coord(i, 0), teamTwo));
                    break;
                case 6:
                    teamOne.add(new Spearman(getName(), new Coord(i, 0), teamTwo));
                    break;
            }

            switch (new Random().nextInt(7)) {
                case 0:
                    teamTwo.add(new Mag(getName(), new Coord(i, 9), teamOne));
                    break;
                case 1:
                    teamTwo.add(new Arbalester(getName(), new Coord(i, 9), teamOne));
                    break;
                case 2:
                    teamTwo.add(new Bandit(getName(), new Coord(i, 9), teamOne));
                    break;
                case 3:
                    teamTwo.add(new Monk(getName(), new Coord(i, 9), teamOne));
                    break;
                case 4:
                    teamTwo.add(new Peasant(getName(), new Coord(i, 9), teamOne));
                    break;
                case 5:
                    teamTwo.add(new Sniper(getName(), new Coord(i, 9), teamOne));
                    break;
                case 6:
                    teamTwo.add(new Spearman(getName(), new Coord(i, 9), teamOne));
                    break;
            }
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}