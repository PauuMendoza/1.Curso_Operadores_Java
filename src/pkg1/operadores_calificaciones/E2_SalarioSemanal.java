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
 * Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un
 * empleado a partir de sus horas semanales trabajadas y de su salario por hora.
 */
public class E2_SalarioSemanal {
    
     public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    
    double pagoHora, sueldoFinal;
    int horasTrabajadas;
    
         System.out.println("Ingresa tu pago por hora: ");
         pagoHora = teclado.nextDouble();
         System.out.println("Ingresa las horas trabajadas por semana");
         horasTrabajadas = teclado.nextInt();
         
         sueldoFinal = pagoHora*horasTrabajadas;
         
         System.out.println("Tu sueldo semanal es $: "+sueldoFinal +" pesos");
         
    

    
    
    
}
}