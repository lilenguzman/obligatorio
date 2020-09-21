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
public class Vehiculo {

    String id;
    String modelo;
    String marca;
    String color;

    public Vehiculo (String id){
        this.id = id;
        this.modelo = "";
        this.marca = "";
        this.color = "";
    }
    
    public Vehiculo (String id, String modelo, String marca, String color){
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getId() {
        return this.id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}
