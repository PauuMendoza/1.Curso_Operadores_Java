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
 */
public class E1_SumaCalificaciones {

    /**
     * @param args the command line arguments
     * 1-. Hacer un programa que calcule e imprima la suma de 3 calificaciones
     * Pedirle las calificaciones al usuario y mostrar la suma.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double C1, C2, C3, Sumatoria;
        
        System.out.println("Ingresa la Calificaciòn 1: ");
        C1 = teclado.nextDouble();
        System.out.println("Ingresa la Calificaciòn 2: ");
        C2 = teclado.nextDouble();
        System.out.println("Ingresa la Calificaciòn 3: ");
        C3 = teclado.nextDouble();
        
        Sumatoria = C1+C2+C3;
        System.out.println("La suma de las 3 calificaciones es: "+Sumatoria);
    }
    
}
