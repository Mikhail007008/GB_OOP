public class Bandit extends Unit {
    private int agility;

    public Bandit(String name) {
        super(name, 100, 40, "Knife", 0.8, 40, 50, 0);
        this.agility = 30;
    }

//    public void speedUp(){
//        getSpeed() + 0.1;
//    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }
}
