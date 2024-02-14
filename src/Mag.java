public class Mag extends Unit{

    private int mana;

    protected Mag(String name) {
        super(name, 110, 20, "Staff", 0.3, 10, 60, 0);
        this.mana = Integer.MAX_VALUE;
    }

    public void manaUp() {
        if(getHealth() < 10){
            mana += 50;
        }
    }

    @Override
    public String toString() {
            return String.format("Name: %s", getName());
    }
}
