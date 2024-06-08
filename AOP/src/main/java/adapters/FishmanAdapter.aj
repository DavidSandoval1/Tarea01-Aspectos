package adapters;
import interfaces.Fighter;
import warriors.Fishman;


public aspect FishmanAdapter {
	declare parents: Fishman implements Fighter;
	
	public boolean Fishman.attack(Fighter fighter){
		if (getHealth() <= 0){
            System.out.println(toString() + " ya no puede combatir!");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        double damage = (getAttackBase() * Math.random())/2 + 50;
        fighter.takeDamage(damage);
        if (getEnergyBase() >= 400){
            System.out.println(toString() + " ha utilizado HEALING");
            setHealth(getHealth() + 100);
            setEnergyBase(0);
        }else{
            rechargeEnergy();
            System.out.println(toString() + " ha recargado energía");
        }
        System.out.println(toString() + " ha atacado a " + fighter);
        return true;
	}
	public void Fishman.takeDamage(double damage) {
		setHealth(getHealth() - damage);
	}
}
