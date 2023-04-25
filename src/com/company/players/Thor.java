package com.company.players;

import com.company.general.RPG_Game;
//5. Добавить еще игрока, Thor, удар по боссу имеет шанс оглушить босса на 1 раунд,
//вследствие чего босс пропускает 1 раунд и не наносит урон героям
public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean isBlind = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && isBlind == true) {
                boss.setDamage(0);
                System.out.println("Boss оглушён");
            } else {
                boss.setDamage(50);
            }
            break;
        }
    }
}
