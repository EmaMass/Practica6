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
    protected boolean encendido;
    
    
    public DispositivoElectronicoDeConsumo(){
        this.encendido = false;
    }
    
    public DispositivoElectronicoDeConsumo(boolean encendido){
        this.encendido = encendido; 
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
}
