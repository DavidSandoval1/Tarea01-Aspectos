package aspectos;

import singleton.Combat;
import java.util.Scanner;

import interfaces.Fighter;

public aspect adaptadores {
	pointcut bienvenida(): execution(Combat getInstance());
	
	before(): bienvenida(){
		System.out.println("Welcome to the Game!");
	}
	
	pointcut salida(): execution(void doCombat(Fighter, Fighter));
	
	after(): salida() {
		System.out.println("\nFin del juego!");
	}
	
}
