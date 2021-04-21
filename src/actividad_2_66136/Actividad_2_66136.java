/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2_66136;

import java.util.Scanner;

/**
 *
 * @author salva
 */
public class Actividad_2_66136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora para obtener tu horario");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora == 8){
                System.out.println("Despertar a las de la mañana");
            } else if(hora >= 11 && hora < 13){
                
                System.out.println("Entrar a clase de Algebra lineal a las " + hora + " de la mañana");
            } else if(hora >= 13 && hora < 14){
                
                System.out.println("Hora de comer");
            } else if(hora >= 14 && hora < 15){
                
                System.out.println("Dormir siesta");
            } else if(hora >= 15 && hora < 18){
                
                System.out.println("Jugar videojuegos de 3 PM a 4 PM");
            } else if(hora >= 18 && hora < 20){ 
                
                System.out.println("Estudiar y hacer tarea");
            } else if(hora == 20){
                
                System.out.println("Cenar");
            } else if(hora >= 21 && hora < 22){
                
                System.out.println("Leer la biblia");
            } else if(hora >= 22 && hora <= 24){
                
                System.out.println("Tiempo libre");
            } else if(hora >= 1 && hora < 8){
                
                System.out.println("Hora de dormir");
            }
        } else {
            System.out.println("Introduce una hora correcto, de 1 a 24 horas");
        }
    }
}
