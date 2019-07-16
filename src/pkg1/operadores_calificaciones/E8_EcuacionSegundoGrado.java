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
 * Construir un programa que calcule y muestre por pantalla  las raices de la
 * ecuacion de segundo grado de coeficientes reales.
 */
public class E8_EcuacionSegundoGrado {
    
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        
        double a, b, c, root, x1, x2;
        
        System.out.println("Ingresa el valor de a: ");
        a = entry.nextInt();
        System.out.println("Ingresa el valor de b: ");
        b = entry.nextInt();
        System.out.println("Ingresa el valor de c: ");
        c = entry.nextInt();
        
        root = Math.pow(b, 2)-4*a*c;
        root = Math.sqrt(root);
        
        x1= -(b)+root/2*a;
        System.out.println("The first solution is x1: " +x1);
        
        x2= -(b)- root/2*a;
        System.out.println("The second solution is x2: "+x2);
    }
    
}
