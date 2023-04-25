package com.company.players;
//17. Reaper(Жнец) - при уровни здоровья менее 30% увеличивается урон вдвое, а при
//15% втрое
public class Reaper extends Hero{
    public Reaper(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HIGH_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < 1; i++) {
            if(heroes[5].getHealth()<54){
                heroes[5].setDamage(heroes[5].getDamage()*2);
            }
            else if(heroes[5].getHealth()<27){
                heroes[5].setDamage(heroes[5].getDamage()*3);
            }
        }
    }
}
