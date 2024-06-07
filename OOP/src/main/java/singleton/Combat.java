/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import interfaces.Fighter;

/**
 *
 * @author Pc
 */
public class Combat {
    private static Combat combat;
    public static Combat getInstance(){
        if (combat==null){
            combat = new Combat();
        }
        return combat;
    }
    public void doCombat(Fighter w1, Fighter w2){
        boolean value1 = true;
        boolean value2 = true;
        int count = 1;
        while(value1 && value2){
            System.out.println("\nTurno "+ count++);
            value1 = w1.attack(w2);
            if (value1) value2 = w2.attack(w1);
        }
    }
}
