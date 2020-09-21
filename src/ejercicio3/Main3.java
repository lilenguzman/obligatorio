/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author LILEN
 */
public class Main3 {
    
    public static void main(String[] args) {
        
        int i;
        Turno turno = new Turno();
        
        // Creacion de hilos.
        Thread[] hilo = new Thread[3];
        char caracter = 'A';
        
        for (i = 0; i < 3; i++) {
            hilo[i] = new Thread (new Letra (caracter, i+1, turno));
            caracter++;
        }
        
        for (i = 0; i < 3; i++)
            hilo[i].start();

    }
    
}
