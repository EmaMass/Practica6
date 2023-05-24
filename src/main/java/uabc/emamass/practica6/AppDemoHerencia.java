/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.practica6;
import java.util.ArrayList;
/**
 *
 * @author poppe
 */
public class AppDemoHerencia {

    public static void main(String[] args) {
        ArrayList<Smartphone> listaDeSmartphones;
        ArrayList<Television> listaDeTVs;
        listaDeSmartphones = new ArrayList<>();
        listaDeTVs = new ArrayList<>();
        listaDeSmartphones.add(new Smartphone());
        listaDeSmartphones.add(new Smartphone());
        listaDeTVs.add(new Television());
        listaDeTVs.add(new Television());
        for(Smartphone celular:listaDeSmartphones){
            System.out.println(celular);
        }
        for(Television television:listaDeTVs){
            System.out.println(television);
        }
    }
}
