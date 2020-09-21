/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.logging.*;

/**
 *
 * @author LILEN
 */
public class VerificarCuenta implements Runnable {

    private CuentaBanco cb = new CuentaBanco();

   

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                cb.hacerRetiro(10);
               // Thread.sleep(1000);//pausa la ejecucion del hilo.
                //lo pauso(libero el lock) asi otro hilo puede ingresar al metodo sincronizado???
                if (cb.getBalance() < 0) {
                    System.out.println("La cuenta está sobregirada.");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VerificarCuenta.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
