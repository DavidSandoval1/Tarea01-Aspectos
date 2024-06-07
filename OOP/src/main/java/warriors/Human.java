/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warriors;

import interfaces.Fighter;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Human extends Warrior implements Fighter {
    public Human() {
        super(800,0,700);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombra a tu guerrero Human: ");
        this.setName(sc.nextLine());
    }
    @Override
    public boolean attack(Fighter fighter) {
        if (this.getHealth() <= 0){
            System.out.println(this + " ya no puede combatir!");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        if (this.getEnergyBase() >= 100){
            double damage = (this.getAttackBase() * Math.random())/2 + 50;
            fighter.takeDamage(damage*2);
            this.setEnergyBase(0);
            System.out.println(this + " ha utilizado PISTOL HITS");
            System.out.println(this + " ha atacado a " + fighter);
        }else {
            this.rechargeEnergy();
            System.out.println(this + " ha recargado energía");
        }
        return true;
    }
    @Override
    public void takeDamage(double damage){
        this.setHealth(this.getHealth() - damage);
    }
    @Override
    public String toString(){
        return "Human " + super.toString();
    }
}