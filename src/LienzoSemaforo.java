
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class LienzoSemaforo {
private boolean rojo;
private boolean amarillo;
private boolean verde;
private boolean rojo2;
private boolean amarillo2;
private boolean verde2;
private int x1;
private int y1;
private int x2;
private int y2;
private int x3;
private int y3;
private int x4;
private int y4;
public HiloSemaforo h=new HiloSemaforo(this,null,null);


    public LienzoSemaforo(int x2,int y2){
    h.start();
    x1=x2;
    y1=y2;
    }
    public void LienzoSemaforo2(int sema2x,int sema2y){
    x2=sema2x;
    y2=sema2y;
    }
    public void LienzoSemaforo3(int sema2x,int sema2y){
    x3=sema2x;
    y3=sema2y;
    }
    public void LienzoSemaforo4(int sema2x,int sema2y){
    x4=sema2x;
    y4=sema2y;
    }
    
    public void dibujarSemaforo(Graphics g2){
    //Semaforo contorno
    g2.setColor(Color.DARK_GRAY);
    g2.fillRect(x1+17, y1+100, 5, 30);
    g2.fillRect(x1, y1, 40, 100);
    g2.setColor(Color.BLACK);
    g2.drawRect(x1, y1, 40, 100);
    g2.drawOval(x1+10, y1+10, 20, 20);    
    g2.drawOval(x1+10, y1+40, 20, 20);
    g2.drawOval(x1+10, y1+70, 20, 20);
    g2.setColor(new Color(90,0,0));
    g2.fillOval(x1+10, y1+10, 20, 20);
    g2.setColor(new Color(130,130,0));
    g2.fillOval(x1+10, y1+40, 20, 20);    
    g2.setColor(new Color(0,130,0));
    g2.fillOval(x1+10, y1+70, 20, 20);  
    
    switch(h.semaforo){
            case 1:
            rojo=true;
            amarillo=false;
            verde=false;
            break;
            case 2:
            amarillo=true;
            rojo=false;
            verde=false;
            break;
            case 3:
            verde=true;
            rojo=false;
            amarillo=false;
        }
        if (rojo==true) {
        g2.setColor(Color.RED);
        g2.fillOval(x1+10, y1+10, 20, 20);
        } 
        if (amarillo==true) {
        g2.setColor(Color.YELLOW);
        g2.fillOval(x1+10, y1+40, 20, 20);
        }
        if (verde==true) {
        g2.setColor(Color.GREEN);
        g2.fillOval(x1+10, y1+70, 20, 20);
        }
        //semaforo 2
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(x2+17, y2+100, 5, 30);
        g2.fillRect(x2, y2, 40, 100);
        g2.setColor(Color.BLACK);
        g2.drawRect(x2, y2, 40, 100);    
        g2.drawOval(x2+10, y2+10, 20, 20);    
        g2.drawOval(x2+10, y2+40, 20, 20);
        g2.drawOval(x2+10, y2+70, 20, 20);
        g2.setColor(new Color(90,0,0));
        g2.fillOval(x2+10, y2+10, 20, 20);
        g2.setColor(new Color(130,130,0));
        g2.fillOval(x2+10, y2+40, 20, 20);    
        g2.setColor(new Color(0,130,0));
        g2.fillOval(x2+10, y2+70, 20, 20); 
        
        switch(h.semaforo2){
            case 1:
            rojo2=true;
            amarillo2=false;
            verde2=false;
            break;
            case 2:
            amarillo2=true;
            rojo2=false;
            verde2=false;
            break;
            case 3:
            verde2=true;
            rojo2=false;
            amarillo2=false;
        }
        if (rojo2==true) {
        g2.setColor(Color.RED);
        g2.fillOval(x2+10, y2+10, 20, 20);
        } 
        if (amarillo2==true) {
        g2.setColor(Color.YELLOW);
        g2.fillOval(x2+10, y2+40, 20, 20);
        }
        if (verde2==true) {
        g2.setColor(Color.GREEN);
        g2.fillOval(x2+10, y2+70, 20, 20);
        }
        
    g2.setColor(Color.DARK_GRAY);
    g2.fillRect(x3+17, y3+100, 5, 30);
    g2.fillRect(x3, y3, 40, 100);
    g2.setColor(Color.BLACK);
    g2.drawRect(x3, y3, 40, 100);
    g2.drawOval(x3+10, y3+10, 20, 20);    
    g2.drawOval(x3+10, y3+40, 20, 20);
    g2.drawOval(x3+10, y3+70, 20, 20);
    g2.setColor(new Color(90,0,0));
    g2.fillOval(x3+10, y3+10, 20, 20);
    g2.setColor(new Color(130,130,0));
    g2.fillOval(x3+10, y3+40, 20, 20);    
    g2.setColor(new Color(0,130,0));
    g2.fillOval(x3+10, y3+70, 20, 20);  
    
    switch(h.semaforo){
            case 1:
            rojo=true;
            amarillo=false;
            verde=false;
            break;
            case 2:
            amarillo=true;
            rojo=false;
            verde=false;
            break;
            case 3:
            verde=true;
            rojo=false;
            amarillo=false;
        }
        if (rojo==true) {
        g2.setColor(Color.RED);
        g2.fillOval(x3+10, y3+10, 20, 20);
        } 
        if (amarillo==true) {
        g2.setColor(Color.YELLOW);
        g2.fillOval(x3+10, y3+40, 20, 20);
        }
        if (verde==true) {
        g2.setColor(Color.GREEN);
        g2.fillOval(x3+10, y3+70, 20, 20);
        }
        //semaforo 2
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(x4+17, y4+100, 5, 30);
        g2.fillRect(x4, y4, 40, 100);
        g2.setColor(Color.BLACK);
        g2.drawRect(x4, y4, 40, 100);    
        g2.drawOval(x4+10, y4+10, 20, 20);    
        g2.drawOval(x4+10, y4+40, 20, 20);
        g2.drawOval(x4+10, y4+70, 20, 20);
        g2.setColor(new Color(90,0,0));
        g2.fillOval(x4+10, y4+10, 20, 20);
        g2.setColor(new Color(130,130,0));
        g2.fillOval(x4+10, y4+40, 20, 20);    
        g2.setColor(new Color(0,130,0));
        g2.fillOval(x4+10, y4+70, 20, 20); 
        
        switch(h.semaforo2){
            case 1:
            rojo2=true;
            amarillo2=false;
            verde2=false;
            break;
            case 2:
            amarillo2=true;
            rojo2=false;
            verde2=false;
            break;
            case 3:
            verde2=true;
            rojo2=false;
            amarillo2=false;
        }
        if (rojo2==true) {
        g2.setColor(Color.RED);
        g2.fillOval(x4+10, y4+10, 20, 20);
        } 
        if (amarillo2==true) {
        g2.setColor(Color.YELLOW);
        g2.fillOval(x4+10, y4+40, 20, 20);
        }
        if (verde2==true) {
        g2.setColor(Color.GREEN);
        g2.fillOval(x4+10, y4+70, 20, 20);
        }
    }
}
