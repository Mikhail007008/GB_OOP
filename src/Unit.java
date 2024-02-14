abstract class Unit{
    private String name;
    private int health;
    private int bron;
    private String weapon;
    private double speed;
    private int power;
    private int atackRange;
    private int rating;

    protected Unit(String name, int health, int bron, String weapon, double speed, int power, int atackRange, int rating) {
        this.name = name;
        this.health = health;
        this.bron = bron;
        this.weapon = weapon;
        this.speed = speed;
        this.power = power;
        this.atackRange = atackRange;
        this.rating = rating;
    }

    public void GetDam(int damage){
        damage += this.rating + this.power;
        this.health -= damage; 
    }

    public void Atack(Unit atacking, Unit opponent, int damage){
        opponent.GetDam(damage);
        atacking.rating += 10;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Health: %d Bron: %d Weapon: %s Speed: %f Power: %d AtackRange: %d", this.name, this.health, this.bron, this.weapon, this.speed,
                this.power, this.atackRange);
    }

    protected String getName() {
        return name;
    }

    protected int getHealth(){
        return health;
    }

    public int getRating() {
        return rating;
    }

    public double getSpeed() {
        return speed;
    }
}