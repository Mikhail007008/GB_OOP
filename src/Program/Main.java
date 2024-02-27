package Program;
import Edits.Coord;
import Edits.Names;
import Edits.View;
import Units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<Unit> holyTeam = new ArrayList<>();
    public static ArrayList<Unit> darkTeam = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {

            switch (new Random().nextInt(7)) {
                case 0:
                    holyTeam.add(new Mag(getName(), new Coord(i, 1)));
                    break;
                case 1:
                    holyTeam.add(new Arbalester(getName(), new Coord(i, 1)));
                    break;
                case 2:
                    holyTeam.add(new Bandit(getName(), new Coord(i, 1)));
                    break;
                case 3:
                    holyTeam.add(new Monk(getName(), new Coord(i, 1)));
                    break;
                case 4:
                    holyTeam.add(new Farmer(getName(), new Coord(i, 1)));
                    break;
                case 5:
                    holyTeam.add(new Sniper(getName(), new Coord(i, 1)));
                    break;
                case 6:
                    holyTeam.add(new Pikeman(getName(), new Coord(i, 1)));
                    break;
            }

            switch (new Random().nextInt(7)) {
                case 0:
                    darkTeam.add(new Mag(getName(), new Coord(i, 10)));
                    break;
                case 1:
                    darkTeam.add(new Arbalester(getName(), new Coord(i, 10)));
                    break;
                case 2:
                    darkTeam.add(new Bandit(getName(), new Coord(i, 10)));
                    break;
                case 3:
                    darkTeam.add(new Monk(getName(), new Coord(i, 10)));
                    break;
                case 4:
                    darkTeam.add(new Farmer(getName(), new Coord(i, 10)));
                    break;
                case 5:
                    darkTeam.add(new Sniper(getName(), new Coord(i, 10)));
                    break;
                case 6:
                    darkTeam.add(new Pikeman(getName(), new Coord(i, 10)));
                    break;
            }
        }

        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                View.view();
                scanner.nextLine();
                int sum1Hp = 0;
                int sum2Hp = 0;

                for (Unit unit : holyTeam){
                    sum1Hp += unit.getHealth();
                }

                for (Unit unit : darkTeam){
                    sum2Hp += unit.getHealth();
                }

                if (sum1Hp == 0){
                    System.out.println("Победила команда GreenTeam");
                    break;
                }

                if (sum2Hp == 0){
                    System.out.println("Победила команда BlueTeam");
                    break;
                }

                for (Unit unit : allTeam) {
                    if (holyTeam.contains(unit)) {
                        unit.step(darkTeam, holyTeam);
                    } else unit.step(holyTeam, darkTeam);
                }
            }
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }


}