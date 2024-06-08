package adapters;

import interfaces.Fighter;
import warriors.Sorcerer;

public aspect SorcererAdapter {
	declare parents: Sorcerer implements Fighter;
	
	public boolean Sorcerer.attack(Fighter fighter){
		if (getHealth() <= 0){
            System.out.println(toString() + " ya no puede combatir");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        double damage = (getAttackBase() * Math.random())/2 + 50;
        if (getEnergyBase() >= 500){
            System.out.println(toString() + " ha utilizado DOMAIN EXPANSION");
            fighter.takeDamage(damage*2);
            setEnergyBase(0);
            System.out.println(toString() + " ha atacado a " + fighter);
        }else {
            fighter.takeDamage(damage);
            System.out.println(toString() + " ha atacado a " + fighter);
            rechargeEnergy();
            System.out.println(toString() + " ha recargado energía");
        }
        return true;
	}
	public void Sorcerer.takeDamage(double damage) {
		setHealth(getHealth() - damage);
	}
}
