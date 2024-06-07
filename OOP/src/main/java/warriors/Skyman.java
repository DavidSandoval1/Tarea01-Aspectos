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
public class Skyman extends Warrior {
    public Skyman() {
        super(500, 500, 500);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombra a tu guerrero Skyman: ");
        this.setName(sc.nextLine());
    }
    @Override
    public String toString(){
        return "Skyman " + super.toString();
    }
}
