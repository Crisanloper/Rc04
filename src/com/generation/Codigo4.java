package com.generation;

import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {//se agrega método
	Scanner sc= new Scanner(System.in);//Se arregla scanner
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = sc.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//Se cambia el número del jugador
    Scanner s2 = new Scanner(System.in);//Se arregla escaner
    String j2 = sc.nextLine();//se arregla sc
    
    if (j1 == j2) {//Se elimina paréntesis adicional
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//se agrega llave de cierre de if 
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
    sc.close();// se cierra escaner
} 
}//Se cierra Main
