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
 * 6.- Hacer un programa que calcule el cuadrado de una suma.
 * (a+b)^2= a^2 + b^2 + 2ab
 */
public class E6_CuadradoDeSuma {
    
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        
        double a,b, parte1, parte2, parte3, resultado;
        
        System.out.println("Ingresa el valor de a: ");
        a = tec.nextFloat();
        System.out.println("Ingresa el valor de b: ");
        b = tec.nextFloat();
        
        //parte1 = Math.pow(a, 2);
        //parte2 = Math.pow(b, 2);
        //parte3 = 2*a*b;
        
        resultado = Math.pow(a, 2)+ (2*a*b) + Math.pow(b, 2);
        
        //resultado = parte1+parte2+parte3;
        System.out.println("El cuadrado de la suma es: " +resultado);
        
        //pense hacer las operaciones de las dos formas, por partes o en conjunto
        //y funciono igual para las dos.
    }
    
}
