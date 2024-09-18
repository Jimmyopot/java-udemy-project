package gameConsole.extraGameFeatures;

import gameConsole.Weapon;

public final class Soldier extends Combatant {
    public Soldier(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
