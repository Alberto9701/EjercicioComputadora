/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.computadora;

/**
 *
 * @author JOSEALBERTO
 */
public class CPU {
    private String marca;
    private String modelo;
    private int velociadProcesador;

    public CPU(String marca, String modelo, int velociadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velociadProcesador = velociadProcesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelociadProcesador() {
        return velociadProcesador;
    }

    public void setVelociadProcesador(int velociadProcesador) {
        this.velociadProcesador = velociadProcesador;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velociadProcesador=" + velociadProcesador + '}';
    }

    
    
    

    
    
    
}
