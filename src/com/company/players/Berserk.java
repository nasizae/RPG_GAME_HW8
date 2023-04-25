package com.company.players;
//2. Berserk должен получать от босса урон, и потом наносить ему свой урон + часть
//урона полученного от босса
public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOCK_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    setBlockedDamage(this.blockedDamage=boss.getDamage()/2);
        for (int i = 0; i < 1; i++) {
            if(boss.getHealth()>0&&heroes[3].getHealth()>0) {
                heroes[3].setDamage(heroes[3].getDamage() + blockedDamage);
            }
        }
    }
    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }
}
