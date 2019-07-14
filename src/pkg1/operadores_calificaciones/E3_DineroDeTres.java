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
 * 
 * Guillermo tiene N Dolares. Luis tiene la mitad de lo que posee Guillermo. Juan
 * tiene la mitad de lo que posee Luis y Guillermo juntos. Hacer un programa que
 * calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
public class E3_DineroDeTres {
    
    public static void main(String[] args) {
        Scanner tec=new Scanner (System.in);
        
        float guillermo, luis, juan, dineroFinal;
        
        System.out.println("Ingresa dolares de Guillermo: ");
        guillermo = tec.nextFloat();
        
        luis = guillermo / 2;
        
        juan = (luis + guillermo)/2;
   
         
        dineroFinal = guillermo + luis + juan;
        
        System.out.println("La suma de dinero de Guillermo, Luis y Juan es :"+dineroFinal+ " dolares");
        
        
        
        
    }
    
}
