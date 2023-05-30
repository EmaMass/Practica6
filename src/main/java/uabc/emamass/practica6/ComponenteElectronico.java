/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;

/**
 *
 * @author poppe
 */
public abstract class ComponenteElectronico extends DispositivoElectronico {
    protected static DispositivoElectronico esParteDe; //Mutable
    
    
    public ComponenteElectronico(){
        ComponenteElectronico.esParteDe = new DispositivoElectronico() {
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
        };
    }
    
    public ComponenteElectronico(DispositivoElectronico esParteDe){
        ComponenteElectronico.esParteDe = esParteDe;
    }
    public DispositivoElectronico getEsParteDe(){
        return esParteDe;
    }
    public void setEsParteDe(DispositivoElectronico dispositivo){
        esParteDe = dispositivo; 
    }
    
    @Override
    public String toString(){
        return "Es parte de: "+ComponenteElectronico.esParteDe;
    }
    
}
