/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author poppe
 */
public class MiMouseAdapter extends MouseAdapter{
    Canvas canvas;  
    private int posX;
    private int posY;
    private int x;
    private int y;
    private int height;
    private int width;
    DispositivoElectronico dispositivo;
    
    public MiMouseAdapter(Canvas canvas){
        super();
        this.canvas = canvas;
    }
    
    public MiMouseAdapter(Canvas canvas, DispositivoElectronico dispositivo, int height, int width, int x, int y){
        super();
        this.canvas = canvas;
        this.dispositivo = dispositivo;
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }
    
    @Override 
    public void mouseClicked(MouseEvent e){
        this.posX = e.getX();
        this.posY = e.getY();
        
        imprimir();
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        if(dispositivo != null && isWithinBounds(e.getX(),e.getY())){
            canvas.setCursor(Cursor.getDefaultCursor());
        }
    }
    
    private boolean isWithinBounds(int x, int y){
        return x >= this.x && x <= this.x + this.width && y >= this.y && y <= this.y + this.height;               
    }
    
    public int getPosX(){
        return posX;
    }
    
    public int getPosY(){
        return posY;
    }
    
    public void imprimir(){
        if (dispositivo != null && isWithinBounds(posX, posY)) {
            System.out.println(dispositivo.toString());
        }
    }
    
}
