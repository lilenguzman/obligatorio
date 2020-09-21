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
public class Personaje implements Runnable{
    
    private Player jugador;
    private int puntos;
  
    public Personaje (int cant, Player jugador){
         this.puntos = cant;
         this.jugador = jugador;
    }  
    
  public void run(){
        jugador.modificarVida(puntos);
    }
  
    
}
