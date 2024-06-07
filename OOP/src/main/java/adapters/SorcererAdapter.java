/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import interfaces.Fighter;
import warriors.Sorcerer;

/**
 *
 * @author Pc
 */
public class SorcererAdapter implements Fighter {
    public Sorcerer sorcerer;
    public SorcererAdapter(){
        sorcerer = new Sorcerer();
    }
    @Override
    public boolean attack(Fighter fighter) {
        if (sorcerer.getHealth() <= 0){
            System.out.println(sorcerer + " ya no puede combatir");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        double damage = (sorcerer.getAttackBase() * Math.random())/2 + 50;
        if (sorcerer.getEnergyBase() >= 500){
            System.out.println(sorcerer + " ha utilizado DOMAIN EXPANSION");
            fighter.takeDamage(damage*2);
            sorcerer.setEnergyBase(0);
            System.out.println(sorcerer + " ha atacado a " + fighter);
        }else {
            fighter.takeDamage(damage);
            System.out.println(sorcerer + " ha atacado a " + fighter);
            sorcerer.rechargeEnergy();
            System.out.println(sorcerer + " ha recargado energía");
        }
        return true;
    }
    @Override
    public void takeDamage(double damage){
        sorcerer.setHealth(sorcerer.getHealth() - damage);
    }
        @Override
    public String toString(){
        return sorcerer.toString();
    }
}
