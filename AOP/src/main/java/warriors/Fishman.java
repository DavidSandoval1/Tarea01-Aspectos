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
public class Fishman extends Warrior {
    public Fishman() {
        super(200,200, 1000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombra a tu guerrero Fishman: ");
        this.setName(sc.nextLine());
    }
    @Override
    public String toString(){
        return "Fishman " + super.toString();
    }
}
