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
public class Teclado {
    private String marca;
    private String modelo;
    private int numerodeteclas;
    private int multimedia;

    public Teclado(String marca, String modelo, int numerodeteclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numerodeteclas = numerodeteclas;
        this.multimedia = multimedia;
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

    public int getNumerodeteclas() {
        return numerodeteclas;
    }

    public void setNumerodeteclas(int numerodeteclas) {
        this.numerodeteclas = numerodeteclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numerodeteclas=" + numerodeteclas + ", multimedia=" + multimedia + '}';
    }

    
    
    

    
    
    
}
