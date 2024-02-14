public class Arbalester extends Unit{
    private String secondWeapon;

    public Arbalester(String name) {
        super(name, 100, 30, "Crossbow", 0.7, 20, 60, 0);
        this.secondWeapon = "knife";
    }

//    public void headShoot(){
//        boolean headShoot = false;
//        if(!headShoot){
//            getRating()*2;
//        }
//    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }
}
