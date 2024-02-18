import java.util.ArrayList;

public class Sniper extends Unit {
    private int hiding;

    public Sniper(String name, Coord position, ArrayList<Unit> team) {
        super(name, 100, 30, "Gun", 0.7, 20, 100, 0, position, team);
        this.hiding = 50;
    }

    public void headShoot(){
        boolean headShoot = false;
        if(!headShoot){
            setRating(getRating() + 10);
        }
    }

    public void target(){
        Unit enemy = findEnemy();
        if (enemy != null) System.out.println("Ближайший враг: " + enemy.getName());
        else System.out.println("Отсутствуют враги в зоне видимости");
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
