package weapon;

public class GrenadeLauncher extends Weapon {
    public GrenadeLauncher(String name) {
        super(name);
    }
    @Override
    public void shot() {
        System.out.println("Ба-бах-бжж");
    }
}
