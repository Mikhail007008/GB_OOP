public class Monk extends Unit{
    private String ironPunch;

    public Monk(String name) {
        super(name, 100, 70, "Axe", 0.3, 70, 10, 0);
        this.ironPunch = ironPunch;
    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }
}
