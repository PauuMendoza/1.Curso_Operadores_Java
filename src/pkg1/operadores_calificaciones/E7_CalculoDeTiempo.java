/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.operadores_calificaciones;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * Ejercicio 7 - Construir un programa que, dado un numero total de horas, 
 * devuelve el numero de semanas, dias y horas equivalente. Por ejemplo, dado un
 * total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
 */
public class E7_CalculoDeTiempo {
    
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        int dias, semanas;
        
        System.out.println("Ingresa la cantidad de horas: ");
        int horas=tec.nextInt();
        
        semanas = horas/168;
        System.out.println(semanas+ "semanas");
      
        dias = horas/24;
        System.out.println(dias+ "dias");
        
 
        
        
        
    }
    
}
