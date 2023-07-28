package dev.que;

import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        return List.of(name, Integer.toString(hitPoints),
                Integer.toString(strength));
    }

    @Override
    public void read(List<String> save) {
        if (save !=null && save.size() > 0) {
            name = save.get(0);
            hitPoints = Integer.parseInt(save.get(1));
            strength = Integer.parseInt(save.get(2));
        }
    }

    @Override
    public String toString() {
        return """
                Monster{name='%s', hitPoints=%d, strength=%d}"""
                .formatted(name, hitPoints, strength);
    }
}
