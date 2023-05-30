/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author poppe
 */
public class IUTelevision extends Canvas {
    private final Television television;
    private BufferedImage image;
    private Canvas canvas;
    private ImageObserver screen;
    private final String file;
    private final int posX;
    private final int posY;
    private final int height;
    private final int width;
    
    public IUTelevision(String file, Television television){
        this.television = television;
        this.file = file;
        posX = 100;
        posY = 100;
        height = 500;
        width = 500;
        try{
            image = ImageIO.read(new File(file));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void imprimirToString(){
    if(posX >= 50 && posX <= 550 && posY >= 10 && posY <= 550){
        System.out.println(television.toString());
        }
    }
    
    public void paint(Graphics g){
        g.drawImage(image,posX,posY,width,height,this);
    }
    
    public void imprimirTelevision(Canvas canvas){
        this.canvas = canvas;
        MiMouseAdapter mouse = new MiMouseAdapter(canvas, television, height, width, posX, posY);
        canvas.addMouseListener(mouse);
        Frame frame = new Frame();
        frame.setSize(1000,1000);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
