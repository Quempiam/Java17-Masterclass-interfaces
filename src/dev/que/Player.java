package dev.que;

import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(name, Integer.toString(hitPoints),
                Integer.toString(strength), weapon);
    }

    @Override
    public void read(List<String> save) {
        if (save !=null && save.size() > 0) {
            name = save.get(0);
            hitPoints = Integer.parseInt(save.get(1));
            strength = Integer.parseInt(save.get(2));
            weapon = save.get(3);
        }
    }

    @Override
    public String toString() {
        return """
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}"""
                .formatted(name, hitPoints, strength, weapon);
    }
}
