public class Peasant extends Unit {
    private int endurance;

    public Peasant(String name) {
        super(name, 100, 0, "Stick", 0.6, 10, 10, 0);
        this.endurance = 50;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }
}
