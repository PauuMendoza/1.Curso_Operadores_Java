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
 * La calificaciòn final de un estudiante de Informàtica se calcula con base a 
 * las calificaciones de cuatro aspectos de su rendimiento acadèmico: participaciòn,
 * primer examèn parcial, segundo examèn parcial y examèn final. Sabiendo que las 
 * calificaciones anteriores entran en la calificaciòn final con ponderaciones del
 * 10%, 25%, 25% y 40% . Hacer un programa que calcule e imprima la calificaciòn
 * final obtenida por un estudiate.
 */
public class E5_CalificacionFinal {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        float notaFinal;
        
        System.out.println("Ingresa tu nota de participacòn: ");
        float participacion = tec.nextFloat();
        float porcetajeParticipacion= participacion * 0.10f;
        
        System.out.println("Ingresa tu nota de primer examen parcial: ");
        float primerExamen = tec.nextFloat();
        float porcetajePrimero= primerExamen * 0.25f;
        
        System.out.println("Ingresa tu nota de segundo examen parcial: ");
        float segundoExamen = tec.nextFloat();
        float porcetajeSegundo= segundoExamen * 0.25f;
        
        System.out.println("Ingresa tu nota del examen final: ");
        float ExamenFinal = tec.nextFloat();
        //float porcetajeFinal= ExamenFinal * 0.40f;
        ExamenFinal *= 0.40f; //operaciones con asignacion!!!!!!
        notaFinal = porcetajeParticipacion+porcetajePrimero+porcetajeSegundo+ExamenFinal;
        
        System.out.println("Tu porcentaje de calificaciòn es: " +notaFinal + "%");
        
        
    }
    
}
