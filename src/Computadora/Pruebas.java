/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computadora;

import ico.fes.computadora.*;


/**
 *
 * @author JOSEALBERTO
 */
public class Pruebas {
    public static void main(String[] args) {
        Monitor monitorhp= new Monitor("Hp","Gamer",15f);
        Teclado tecladoasus=new Teclado("Asus","Mecanico",45,10);
        Mouse mouserogue=new Mouse("Rogue","Gamer","Inalambrico");
        CPU cpuintel=new CPU("Intel","Corei7",3000);
        Computadora computadoragamer=new Computadora("Alienware","Aurora R10",monitorhp,mouserogue,tecladoasus,cpuintel);
        
        System.out.println(computadoragamer);
    }
}
