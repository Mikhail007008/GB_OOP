package Units;

import Edits.Coord;

import java.util.ArrayList;
import java.util.Comparator;

abstract public class Magician extends Unit {

    protected int mana;
    protected int maxMana;
    protected boolean flag;


    public Magician(String name, String weapon, Coord position) {
        super(name, 100, 100, 20, weapon, 1, 10, 60, 0, position);
        maxMana = mana = 10;
        flag = false;
    }

    private void manaUp() {
        mana++;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health == 0 || friend.isEmpty()) return;

        ArrayList<Unit> tempList = new ArrayList<>(friend);
        ArrayList<Unit> deadList = new ArrayList<>();
        tempList.sort(Comparator.comparingInt(Unit::getHealth));
        int firstUnitHp = tempList.getFirst().health;

        for (Unit unit : tempList) {
            if (unit.health == 0) {
                deadList.add(unit);
            }
        }

        if (deadList.size() > 3) {
            flag = true;
        }

        if (flag && mana == 10) {
            deadList.sort(Comparator.comparingInt(Unit::getSpeed).reversed());
            deadList.getFirst().health = maxHealth;
            mana = 0;
            flag = false;
            return;
        }

        if (flag) {
            manaUp();
            return;
        }

        if (mana < 2) {
            manaUp();
            return;
        }

        if (firstUnitHp > 0) {
            firstUnitHp += 10;
            mana -= 2;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", \u2756 : " + mana;
    }
}