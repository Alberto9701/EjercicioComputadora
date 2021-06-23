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
public class Computadora {
    private String Marca;
    private String Modelo;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private CPU cpu;

    public Computadora(String Marca, String Modelo, Monitor monitor, Mouse mouse, Teclado teclado, CPU cpu) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", \nmonitor=" + monitor + ", \nmouse=" + mouse + ", \nteclado=" + teclado + ", \ncpu=" + cpu + '}';
    }
    
    

    
    
    
    
}
