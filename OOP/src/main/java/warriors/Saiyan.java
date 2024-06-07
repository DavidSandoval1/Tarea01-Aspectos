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
public class Saiyan extends Warrior implements Fighter {
    public Saiyan() {
        super(600,500,400);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombra a tu guerrero Saiyan: ");
        this.setName(sc.nextLine());
    }
    @Override
    public boolean attack(Fighter fighter) {
        if (this.getHealth() <= 0){
            System.out.println(this + " ya no puede combatir!");
            System.out.println(fighter + " es el ganador");
            return false;
        }
        if (this.getEnergyBase() >= 300){
            double damage = (this.getAttackBase() * Math.random())/2 + 50;
            fighter.takeDamage(damage);
            this.setEnergyBase(this.getEnergyBase() - 200);
            System.out.println(this + " ha utilizado KAMEHAMEHA");
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
        return "Saiyan " + super.toString();
    }
}
