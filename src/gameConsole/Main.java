package gameConsole;

import gameConsole.extraGameFeatures.Pirate;
import gameConsole.extraGameFeatures.Town;

public class Main {
    public static void main(String[] args) {
//        var console = new GameConsole<>(new ShooterGame("Black Hawk Down"));
//
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("weapon = " + weapon + ", hitpoints=" +
                weapon.getHitPoints() + ", minLevel=" + weapon.getMinLevel());

        var list = Weapon.getWeaponsByLevel(1);
        list.forEach(System.out::println);

        Pirate tim = new Pirate("Tim");
        System.out.println(tim);

        PirateGame.getTowns(0).forEach(System.out::println);
        System.out.println("-----------------------------------");
        PirateGame.getTowns(1).forEach(System.out::println);

        Town machakos = new Town("Machakos", "Mch", 0);
        System.out.println(machakos);

//        var console = new GameConsole<>(new PirateGame("The pirate game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);
    }
}
