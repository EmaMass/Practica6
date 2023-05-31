/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.emamass.practica6;

/**
 *
 * @author poppe
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;
public class IUSmartphone extends Canvas{
    private final Smartphone smartphone;
    private BufferedImage image;
    private Canvas canvas;
    private ImageObserver screen;
    private final String file;
    private final int posX;
    private final int posY;
    private final int height;
    private final int width;
    
    public IUSmartphone(String file, Smartphone smartphone){
        this.smartphone = smartphone;
        this.file = file;
        posX = 50;
        posY = 50;
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
        System.out.println(smartphone.toString());
        }
    }
    
    @Override
    public void paint(Graphics g){
        g.drawImage(image,posX,posY,width,height,this);
    }
    
    public void imprimirSmartphone(Canvas canvas){
        this.canvas = canvas;
        MiMouseAdapter mouse = new MiMouseAdapter(canvas, smartphone, height, width, posX, posY);
        canvas.addMouseListener(mouse);
        
        Frame frame = new Frame();
        frame.setSize(1000,1000);
        frame.add(canvas);
        frame.setVisible(true);
        
    }
}
