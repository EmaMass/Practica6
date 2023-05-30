/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;
import java.util.ArrayList;
/**
 *
 * @author poppe Emanuel
 */
public abstract class DispositivoElectronico {
    protected static String fabricante; //Inmutable
    protected static String numeroSerie; //Inmutable
    protected static String marca; //Inmutable
    protected static String nombre; //Inmutable
    protected static float costo; //Mutable
    protected static ArrayList<ComponenteElectronico> componentes; //Mutable
    
    public DispositivoElectronico(){
        DispositivoElectronico.fabricante = "TSMC";
        DispositivoElectronico.numeroSerie = "7000";
        DispositivoElectronico.marca = "AMD";
        DispositivoElectronico.nombre = "Ryzen";
        DispositivoElectronico.costo = 281;
        DispositivoElectronico.componentes = new ArrayList<>();
    }
    
    public DispositivoElectronico(float costo, ArrayList<ComponenteElectronico> componentes){
        DispositivoElectronico.fabricante = "TSMC";
        DispositivoElectronico.numeroSerie = "7000";
        DispositivoElectronico.marca = "AMD";
        DispositivoElectronico.nombre = "Ryzen";
        DispositivoElectronico.costo = costo;
        DispositivoElectronico.componentes = componentes;
    }
    
    public abstract void agregarComponente(ComponenteElectronico componente);
    public abstract void quitarComponente(ComponenteElectronico componente);
    public abstract float cambiarCosto();
    
    public static float getCosto(){
        return costo; 
    }
    
    public static ArrayList<ComponenteElectronico> getComponentes(){
        return componentes;
    }
    
    public static String getFabricante(){
        return fabricante;
    }
    
    public static String getNumeroSerie(){
        return numeroSerie;
    }
    
    public static String getMarca(){
        return marca;
    }
    
    public static String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        for (int i = 0; i < DispositivoElectronico.componentes.size(); i++){
            cadena += DispositivoElectronico.componentes.get(i);
        }
        return "Fabricante: "+DispositivoElectronico.fabricante+"\nNumero Serie: "+DispositivoElectronico.numeroSerie+"\nMarca: "+DispositivoElectronico.marca+"\nNombre: "+DispositivoElectronico.nombre+"\nCosto: "+DispositivoElectronico.costo+"\nComponentes: "+cadena;
    }
}
