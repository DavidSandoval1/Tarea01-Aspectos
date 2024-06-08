/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import adapters.*;
import warriors.*;
import singleton.Combat;

import aspectos.adaptadores;
/**
 *
 * @author Pc
 */
public class CombatWarriors {

    public static void main(String[] args) {
        Combat combat = Combat.getInstance();
        // Creación de combatientes
        SorcererAdapter sorcerer = new SorcererAdapter();
        FishmanAdapter fishman = new FishmanAdapter();
        //SkymanAdapter skyman = new SkymanAdapter();
        //Saiyan saiyan = new Saiyan();
        //Human human = new Human();
        // Combate
        
        combat.doCombat(fishman, sorcerer);
        
    }
}
