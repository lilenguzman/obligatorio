/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author LILEN
 */
public class CuentaBanco {

    private int balance = 50;

    public CuentaBanco() {
    }

    public synchronized int getBalance() {
        return balance;
    }

    private synchronized  void retiroBancario(int retiro) {
        balance = balance - retiro;
    }
    
    public synchronized void hacerRetiro(int cantidad) throws InterruptedException {
        if (this.getBalance() >= cantidad) {
            System.out.println(Thread.currentThread().getName()
                    + "está realizando un retiro de: $" + cantidad + ".");
            Thread.sleep(1000);
            this.retiroBancario(cantidad);
            System.out.println(Thread.currentThread().getName() + ":Retiro realizado.");
            System.out.println("\033[32m"+Thread.currentThread().getName() + "\033[32m Los fondos son de: $" + this.getBalance());
        } else {
            System.out.println("\033[31mNo hay suficiente dinero en la cuenta para realizar el retiro Sr." + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de $"
                    + this.getBalance());
            Thread.sleep(1000);
        }
    }
}
