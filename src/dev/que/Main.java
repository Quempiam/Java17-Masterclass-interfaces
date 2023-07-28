package dev.que;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player bard = new Player("Solaufin Naerth", 20, 10);
        bard.setWeapon("citra");
        Player warlock = new Player("Oama A. Dbania", 30, 13);
        warlock.setWeapon("quarterstaff");

        Monster goblin = new Monster("goblin_1", 5, 8);
        Monster beholder = new Monster("Beholder_boss_1", 120, 40);

        System.out.println(bard.toString());
        System.out.println(warlock.toString());
        System.out.println(goblin.toString());
        System.out.println(beholder.toString());

        System.out.println("-".repeat(30));

        System.out.println(bard.write());
        System.out.println(goblin.write());

        warlock.read(List.of("Solaufin Naerth", Integer.toString(25), Integer.toString(10), "flute"));

        System.out.println("-".repeat(30));

        System.out.println(warlock.toString());

    }
}
