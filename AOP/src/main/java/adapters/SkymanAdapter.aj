package adapters;

import interfaces.Fighter;
import warriors.Skyman;

public aspect SkymanAdapter {
	
	declare parents: Skyman implements Fighter;
	
    public boolean Skyman.attack(Fighter fighter) {
        if (getHealth() <= 0){
            System.out.println(toString() + " ya no puede combatir!");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        if (getEnergyBase() > 0){
            double damage = (getAttackBase() * Math.random())/2 + 50;
            fighter.takeDamage(damage);
            setEnergyBase(getEnergyBase() - 100);
            System.out.println(toString() + " ha utilizado LIGHTING");
            System.out.println(toString() + " ha atacado a " + fighter);
        }else {
            rechargeEnergy();
            System.out.println(toString() + " ha recargado energía");
        }
        return true;
    }
    public void Skyman.takeDamage(double damage){
        setHealth(getHealth() - damage);
    }
}
