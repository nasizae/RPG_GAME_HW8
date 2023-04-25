package com.company.players;

import com.company.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int addDamage= RPG_Game.random.nextInt(5,10);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + addDamage);
            }
        }
        System.out.println("Magic Add Damage:"+addDamage);
    }
}