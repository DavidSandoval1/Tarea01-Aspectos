/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import interfaces.Fighter;
import warriors.Fishman;

/**
 *
 * @author Pc
 */
public class FishmanAdapter implements Fighter{
    public Fishman fishman;
    public FishmanAdapter(){
        fishman = new Fishman();
    }
    @Override
    public boolean attack(Fighter fighter) {
        if (fishman.getHealth() <= 0){
            System.out.println(fishman + " ya no puede combatir!");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        double damage = (fishman.getAttackBase() * Math.random())/2 + 50;
        fighter.takeDamage(damage);
        if (fishman.getEnergyBase() >= 400){
            System.out.println(fishman + " ha utilizado HEALING");
            fishman.setHealth(fishman.getHealth() + 100);
            fishman.setEnergyBase(0);
        }else{
            fishman.rechargeEnergy();
            System.out.println(fishman + " ha recargado energía");
        }
        System.out.println(fishman + " ha atacado a " + fighter);
        return true;
    }
    @Override
    public void takeDamage(double damage){
        fishman.setHealth(fishman.getHealth() - damage);
    }
    @Override
    public String toString(){
        return fishman.toString();
    }
}
