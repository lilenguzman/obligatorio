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
public class Player {
    
    private int vida;
    
    // Constructor.
    public Player (){
        this.vida = 10;
    }
    
    // Interfaz.
    public synchronized int getVida(){
        return vida;
    }
  
    
    private synchronized void setVida(int vida) {
        this.vida = vida;
    }
    public synchronized void modificarVida(int puntos){
        
        int vidaActual = this.getVida();
        vidaActual = vidaActual + puntos;
        this.setVida(vidaActual);
        
    }
    
    
}