/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;

/**
 *
 * @author poppe
 */
public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    protected static boolean encendido;
    
    
    public DispositivoElectronicoDeConsumo(){
        DispositivoElectronicoDeConsumo.encendido = false;
    }
    
    public DispositivoElectronicoDeConsumo(boolean encendido){
        DispositivoElectronicoDeConsumo.encendido = encendido; 
    }
    
    public void encender(){
        encendido = true;
    }
    
    public void apagar(){
        encendido = false;
    }
    
    public boolean isEncendido(){
        return encendido;
    }
    
    @Override 
    public String toString(){
        return "Encendido? : "+DispositivoElectronicoDeConsumo.encendido;
    }
}
