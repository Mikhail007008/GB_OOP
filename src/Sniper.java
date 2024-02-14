public class Sniper extends Unit {
    private int hiding;

    public Sniper(String name) {
        super(name, 100, 30, "Gun", 0.7, 20, 100, 0);
        this.hiding = hiding;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }
}
