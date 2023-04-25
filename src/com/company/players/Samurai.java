package com.company.players;

import com.company.general.RPG_Game;

//15. Герой Samurai кидает сюрикенами которые делятся на два вида: 1) Вирус наносит
//N-e кол-во урона. 2) Вакцина лечит на N-e кол-во единиц здоровье босса. сюрикены
//выбирает Рандом.
public class Samurai extends Hero{
    public Samurai(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.VIRUS);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean suriken= RPG_Game.random.nextBoolean();
        int damageSuriken=RPG_Game.random.nextInt(10,15);
        int regenHealthSuriken=RPG_Game.random.nextInt(5,10);
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth()>0&&suriken==true){
                boss.setHealth(boss.getHealth()-damageSuriken);
                System.out.println("вирус нанёс урон на "+damageSuriken);
                break;
            }
            else if(suriken==false){
                boss.setHealth(boss.getHealth()+regenHealthSuriken);
                System.out.println("вакцина добавил хп на:"+regenHealthSuriken);
            break;
            }

        }
    }
}
