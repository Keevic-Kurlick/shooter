import weapon.*;

public class Player {
    // Указываем тип данных weapon.Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
               new MachineGun("автомат"),
               new Pistol("пистолет"),
               new Slingshot("рогатка"),
               new WaterGun("водяной пистолет"),
               new GrenadeLauncher("гранатомет")
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= 0 && slot < weaponSlots.length) {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
            System.out.println("(выстрел из оружия: " + weapon.getName() + ")");
        } else {
            System.out.println("Значение слота некорректно!");
        }
    }
}
