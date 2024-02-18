import java.util.ArrayList;

public class Mag extends Unit{

    private int mana;

    protected Mag(String name, Coord position, ArrayList<Unit> team) {
        super(name, 110, 20, "Staff", 0.3, 10, 60, 0, position, team);
        this.mana = 30;
    }

    public void manaUp() {
        if(getHealth() < 10){
            mana += 50;
        }
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
}
