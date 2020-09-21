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
public class Turno {
    
    private int variableTurno = 1;
    
    public Turno(){
        this.variableTurno = 1;
    }
    
    public synchronized int getTurno(){
        return variableTurno;
    }
    
    public synchronized void modificarTurno(){
        this.variableTurno ++;
        
        if (variableTurno == 4)
            variableTurno = 1;
    }
    
}