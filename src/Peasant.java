import java.util.ArrayList;

public class Peasant extends Unit {
    private int endurance;

    public Peasant(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 0, "Stick", 0.6, 10, 10, 0, position, team);
        this.endurance = 50;
    }

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

    @Override
    public String toString() {return String.format("Name: %s, Coord: %s", getName(), getPosition());}
}
