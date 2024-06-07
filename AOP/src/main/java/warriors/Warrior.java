/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warriors;

/**
 *
 * @author Pc
 */
public abstract class Warrior {
    private String name = "warrior";
    private double attackBase;
    private int energyBase;
    private double health;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void rechargeEnergy(){
        energyBase+=100;
    }
    
    public double getAttackBase() {
        return attackBase;
    }

    public void setAttackBase(double attackBase) {
        this.attackBase = attackBase;
    }

    public int getEnergyBase() {
        return energyBase;
    }

    public void setEnergyBase(int energyBase) {
        this.energyBase = energyBase;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    public Warrior(double attackBase, int energyBase, double health) {
        this.attackBase = attackBase;
        this.energyBase = energyBase;
        this.health = health;
    }
    
    @Override
    public String toString(){
        return this.getName() + " " + "[" + String.format("%.2f", this.getHealth()) + "HP]";
    }
}
