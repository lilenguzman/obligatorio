/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author LILEN
 */
import java.util.Random;

public class Main{
    
    public static void main(String[] args) {
        System.out.println("SIMULANDO EL TIEMPO QUE TARDA EL VEHICULO EN RECORRER KM ");
        int i, numAutos = 5;
        char letra = 'A';
        String patente;
        Random random = new Random();
        Surtidor reserva = new Surtidor();
        
        // Creacion de hilos.
        Thread[] hilo = new Thread[numAutos];
        
        for (i = 0; i < numAutos; i++){
            
            patente = Character.toString(letra) + i;
            Auto autoActual = new Auto (Character.toString(letra) +(i*1000), patente, random.nextInt(10)*10+280, reserva);
            hilo[i] = new Thread (autoActual, patente);
            letra ++;
        }
        
        for (i = 0; i < numAutos; i++)
            hilo[i].start();
        
        for (i = 0; i < numAutos; i++){
            try{
                hilo[i].join();
            } catch (InterruptedException exc){}
        }
        
        System.out.println("\033[35mEl sustidor dispone de " + reserva.getLitrosDispon() + " litros.\n");
    }
    
}