/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import warriors.Warrior;

/**
 *
 * @author Pc
 */
public interface Fighter {
    public boolean attack(Fighter fighter);
    public void takeDamage(double damage);
}
