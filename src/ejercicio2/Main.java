/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author LILEN
 */
public class Main {
    public static void main(String[] args) {
        
        Player jugador = new Player();
        
        // Creacion de hilos por medio de la interfaz Runnable.
        Personaje o = new Personaje (-3, jugador);
        Personaje c = new Personaje(3, jugador);
        
        Thread orco = new Thread(o, "Orco");
        Thread curandero = new Thread (c, "Curandero");
        
        orco.start();
        curandero.start();
        
        try{
            orco.join();
            curandero.join();
            System.out.println("El JUGADOR tiene " + jugador.getVida() + " puntos de VIDA.");
        } catch (InterruptedException excep){}
        
        
    }
}
