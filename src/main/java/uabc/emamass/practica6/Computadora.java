/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;

/**
 *
 * @author poppe
 */
public class Computadora extends DispositivoElectronico{
    //Texto de la practica dice extiende desde DispositivoElectronico
    //Pero imagen tiene la flecha de herencia hacia DeConsumo
    protected static Microprocesador CPU;
    protected static long ramMB;
    
    public Computadora(){
        Computadora.CPU = new Microprocesador();
        Computadora.ramMB = 16000;
    }
    
    public Computadora(Microprocesador CPU, long ramMB){
        Computadora.CPU = CPU;
        Computadora.ramMB = ramMB;
    }
    
    public Microprocesador getCPU(){
        return CPU; 
    }
    public void setCPU(Microprocesador CPU){
        Computadora.CPU = CPU;
    }
    public void setRamMB(long ramMB){
        Computadora.ramMB = ramMB;
    }
    public long getRamMB(){
        return ramMB;
    }
    
    @Override
    public String toString(){
        return "Microprocesador: "+Computadora.CPU+"\nRam MB: "+Computadora.ramMB;
    }

    @Override
    public void agregarComponente(ComponenteElectronico componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quitarComponente(ComponenteElectronico componente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float cambiarCosto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
