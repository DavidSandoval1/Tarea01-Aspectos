/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import interfaces.Fighter;
import warriors.Skyman;

/**
 *
 * @author Pc
 */
public class SkymanAdapter implements Fighter{
    public Skyman skyman;
    public SkymanAdapter(){
        skyman = new Skyman();
    }
    @Override
    public boolean attack(Fighter fighter) {
        if (skyman.getHealth() <= 0){
            System.out.println(skyman + " ya no puede combatir!");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        if (skyman.getEnergyBase() > 0){
            double damage = (skyman.getAttackBase() * Math.random())/2 + 50;
            fighter.takeDamage(damage);
            skyman.setEnergyBase(skyman.getEnergyBase() - 100);
            System.out.println(skyman + " ha utilizado LIGHTING");
            System.out.println(skyman + " ha atacado a " + fighter);
        }else {
            skyman.rechargeEnergy();
            System.out.println(skyman + " ha recargado energía");
        }
        return true;
    }
    @Override
    public void takeDamage(double damage){
        skyman.setHealth(skyman.getHealth() - damage);
    }
    @Override
    public String toString(){
        return skyman.toString();
    }
}
