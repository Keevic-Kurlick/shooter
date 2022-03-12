package weapon;

public class Pistol extends Weapon {
    public Pistol (String name) {
        super(name);
    }

    @Override
    public void shot() {
        System.out.println("Тдыщ");
    }
}
