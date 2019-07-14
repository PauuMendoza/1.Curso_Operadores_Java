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
 * Una compañia de venta de carros usados, paga a su personal de ventas un salario
 * de $1000 mensuales, mas una comision de $150 por cada carro vendido, màs el 5%
 * del valor de la venta por carro. Cada mes el capturista de la empresa ingresa
 * en la computadora los datos pertinentes. Hacer un programa que calcule e imprima
 * el salario mensual de un vendedor dado.
 */
public class E4_VendedorDeCarros {
     public static void main(String[] args) {
         Scanner tec=new Scanner(System.in);
         
         float pagoMensual=1000, comision=150, totalComision, porcentaje=0.05f, totalPorcentaje, sueldof;
         
         
         System.out.println("Ingresa el nùmero de carros vendidos por mes: ");
         int carrosVendidos= tec.nextInt();
         
         System.out.println("Ingresa el valor del carro vendido");
         float valorCarro= tec.nextInt();
         
        totalComision = comision * carrosVendidos;
        
        
        totalPorcentaje = (valorCarro * porcentaje) *carrosVendidos;
         System.out.println(totalPorcentaje);
       
        sueldof = pagoMensual+totalComision+totalPorcentaje; 
        
         System.out.println("el sueldo mensual es : "+sueldof);
         
        
        
         
         
         
     }
    
    
}
