package weapon;

public class Slingshot extends Weapon {
    public Slingshot (String name) {
        super(name);
    }

    @Override
    public void shot() {
        System.out.println("Фью-ить");
    }
}
