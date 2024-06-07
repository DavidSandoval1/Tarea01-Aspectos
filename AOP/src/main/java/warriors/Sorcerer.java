/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warriors;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Sorcerer extends Warrior {
    public Sorcerer(){
        super(600,300,600);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombra a tu guerrero Sorcerer: ");
        this.setName(sc.nextLine());
    }
    @Override
    public String toString(){
        return "Sorcerer "+ super.toString();
    }
}
