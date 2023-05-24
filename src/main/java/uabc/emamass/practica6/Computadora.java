/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;

/**
 *
 * @author poppe
 */
public abstract class Computadora extends DispositivoElectronico{
    //Texto de la practica dice extiende desde DispositivoElectronico
    //Pero imagen tiene la flecha de herencia hacia DeConsumo
    protected Microprocesador CPU;
    protected long ramMB;
    
    public Computadora(){
        this.CPU = new Microprocesador();
        this.ramMB = 16000;
    }
    
    public Computadora(Microprocesador CPU, long ramMB){
        this.CPU = CPU;
        this.ramMB = ramMB;
    }
    
    public abstract void getCPU();
    public abstract void setCPU();
    public abstract void setRamMB();
    public abstract void getRamMB();
}
