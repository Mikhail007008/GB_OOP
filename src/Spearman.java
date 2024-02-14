public class Spearman extends Unit{
    private int doubleBron;

    public Spearman(String name) {
        super(name, 100, 80, "spear", 0.5, 60, 20, 0);
        this.doubleBron = 20;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }
}
