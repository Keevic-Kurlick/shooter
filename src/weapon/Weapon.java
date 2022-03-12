package weapon;

public class Weapon {

    protected String name;

    protected Weapon(String name) {
        this.name = name;
    }

    public void shot() {
        System.out.println(" ");
    }

    public String getName() {
        return name;
    }
}
