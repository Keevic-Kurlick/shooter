package weapon;

public class WaterGun extends Weapon {

    public WaterGun(String name) {
        super(name);
    }

    @Override
    public void shot() {
        System.out.println("Буль-буль");
    }
}
