/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.emamass.practica6;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.*;
import java.util.Scanner;
/**
 *
 * @author poppe
 */
public class AppDemoHerencia extends Canvas {

    public static void main(String[] args) {
        int numerador = 0;
        ArrayList<Smartphone> listaDeSmartphones;
        ArrayList<Television> listaDeTVs;
        listaDeSmartphones = new ArrayList<>();
        listaDeTVs = new ArrayList<>();
        listaDeSmartphones.add(new Smartphone());
        listaDeSmartphones.add(new Smartphone());
        listaDeTVs.add(new Television());
        listaDeTVs.add(new Television());
        for(Smartphone celular:listaDeSmartphones){
            numerador += 1;
            System.out.println("Smartphone "+numerador+":");
            System.out.println(celular);
        }
        numerador = 0;
        for(Television television:listaDeTVs){
            numerador += 1;
            System.out.println("Television "+numerador+":");
            System.out.println(television);
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe a en consola para smartphone, cualquier otro caracter para telefono");
        String charx = scn.nextLine();
        if(charx == "a"){
        IUSmartphone s = new IUSmartphone("D://Documents//NetBeansProjects//Practica6//src//main//java//uabc//emamass//practica6//android.png",new Smartphone());
        Canvas canvas = new Canvas();
        s.imprimirSmartphone(canvas);
        } else{
        IUTelevision t = new IUTelevision("D://Documents//NetBeansProjects//Practica6//src//main//java//uabc//emamass//practica6//television.png",new Television());
        Canvas canvas = new Canvas();
        t.imprimirTelevision(canvas);
        }
        
    }
}
