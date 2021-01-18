
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
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
public class LienzoPersonas extends Canvas{
    public int x=50;
    public int y=350;
    
    public int x2=70;
    public int y2=350;
    
    public int x3=80;
    public int y3=350;
    
    public int x4=100;
    public int y4=350;
    
    public int cabeza=10;
    public int cuerpo=7;
    public int manos=2;
    public int piez=3;
    public int mov;
    public int mov2;
    public int mov3;
    public int mov4;
    public int mpiezi;
    public int mpiezd;
    public int mpiezi2;
    public int mpiezd2;
    public int mpiezi3;
    public int mpiezd3;
    public int mpiezi4;
    public int mpiezd4;
    
    private int areax=310;
    private int areay=290;
    private int ancho=100;
    private int alto=300;
    
    private int areaxd=450;
    private int areayd=290;
    private int anchod=100;
    private int altod=300;
    
    public HiloSemaforo h=new HiloSemaforo(null,null,this);
    
    public Timer t=new Timer(100,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x++;
            mov++;
            repaint();
            if(mov>=0&&mov<=10){
            mpiezi--;
            mpiezd++;
            }
            if(mov>=11&&mov<=20){
            mpiezi++;
            mpiezd--;
            }
            if(mov==20){
            mov=0;
            }
            if(x==900){
            x=0;
            }
        }
    } );
    public Timer t2=new Timer(80,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            x2++;
            mov2++;
            if(mov2>=0&&mov2<=10){
            mpiezi2--;
            mpiezd2++;
            }
            if(mov2>=11&&mov2<=20){
            mpiezi2++;
            mpiezd2--;
            }
            if(mov2==20){
            mov2=0;
            }
            if(x2==900){
            x2=0;
            }
        }
    } );
    public Timer t3=new Timer(60,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            x3++;
            mov3++;
            if(mov3>=0&&mov3<=10){
            mpiezi3--;
            mpiezd3++;
            }
            if(mov3>=11&&mov3<=20){
            mpiezi3++;
            mpiezd3--;
            }
            if(mov3==20){
            mov3=0;
            }
            if(x3==900){
            x3=0;
            }
        }
    } );
    public Timer t4=new Timer(50,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x4++;
            mov4++;
            if(mov4>=0&&mov4<=10){
            mpiezi4--;
            mpiezd4++;
            }
            if(mov4>=11&&mov4<=20){
            mpiezi4++;
            mpiezd4--;
            }
            if(mov4==20){
            mov4=0;
            }
            if(x4==900){
            x4=0;
            }
        }
    } );
    
    public boolean llegoArea(int x,int y){
    int x2=areax+ancho;
    int y2=areay+alto;
        if (x>=areax &&x<=x2) {
            if (y>=areay&&y<=y2) {
                return true;
            }
        }
    return false;
    }
    
    public boolean llegoArea2(int x,int y){
    int x2=areaxd+anchod;
    int y2=areayd+altod;
        if (x>=areaxd &&x<=x2) {
            if (y>=areayd&&y<=y2) {
                return true;
            }
        }
    return false;
    }
    
    public LienzoPersonas(){
    //can=cantidad;
    h.start();
    }
    
    public void dibujarPersona(Graphics g2){
    if (llegoArea(x,y) && h.semaforo==3) {
            t.stop();
    }
    if (llegoArea(x,y)&& h.semaforo==2) {
            t.stop();
    }
    if (h.semaforo==1) {
            t.start();    
    }
    
    g2.setColor(Color.BLACK);
    //1RO
    //cuerpo cabeza
    g2.fillOval(x, y, cabeza, cabeza);
    g2.fillRect(x+4, y+10, cuerpo-5, cuerpo+10);
    //manos
    g2.drawLine(x+4, y+15, x+mpiezd, y+25);
    g2.drawLine(x+5, y+15, x+mpiezd, y+25);
    //piez
    g2.drawLine(x+5, y+26, x+10+mpiezi, y+35);
    g2.drawLine(x+5, y+27, x+11+mpiezi, y+35);
    g2.drawLine(x+4, y+26, x+mpiezd, y+35);
    g2.drawLine(x+4, y+27, x+mpiezd, y+35);
    
    if (llegoArea(x2,y2) && h.semaforo==3) {
            t2.stop();
            
    }
    if (llegoArea(x2,y2)&& h.semaforo==2) {
            t2.stop();
    }
    if (h.semaforo==1) {
            t2.start();    
    }    
    //2DO
    //cuerpo cabeza
    g2.fillOval(x2, y2, cabeza, cabeza);
    g2.fillRect(x2+4, y2+10, cuerpo-5, cuerpo+10);
    //manos
    g2.drawLine(x2+4, y2+15, x2+mpiezd2, y2+25);
    g2.drawLine(x2+5, y2+15, x2+mpiezd2, y2+25);
    //piez
    g2.drawLine(x2+5, y2+26, x2+10+mpiezi2, y2+35);
    g2.drawLine(x2+5, y2+27, x2+11+mpiezi2, y2+35);
    g2.drawLine(x2+4, y2+26, x2+mpiezd2, y2+35);
    g2.drawLine(x2+4, y2+27, x2+mpiezd2, y2+35);
    
    if (llegoArea(x3,y3) && h.semaforo==3) {
            t3.stop();
            
    }
    if (llegoArea(x3,y3)&& h.semaforo==2) {
            t3.stop();
    }
    if (h.semaforo==1) {
            t3.start();    
    }
    //3RO
    //cuerpo cabeza
    g2.fillOval(x3, y3, cabeza, cabeza);
    g2.fillRect(x3+4, y3+10, cuerpo-5, cuerpo+10);
    //manos
    g2.drawLine(x3+4, y3+15, x3+mpiezd3, y3+25);
    g2.drawLine(x3+5, y3+15, x3+mpiezd3, y3+25);
    //piez
    g2.drawLine(x3+5, y3+26, x3+10+mpiezi3, y3+35);
    g2.drawLine(x3+5, y3+27, x3+11+mpiezi3, y3+35);
    g2.drawLine(x3+4, y3+26, x3+mpiezd3, y3+35);
    g2.drawLine(x3+4, y3+27, x3+mpiezd3, y3+35);
    
    if (llegoArea(x4,y4) && h.semaforo==3) {
            t4.stop();
            
    }
    if (llegoArea(x4,y4)&& h.semaforo==2) {
            t4.stop();
    }
    if (h.semaforo==1) {
            t4.start();    
    }
    //4TO
    //cuerpo cabeza
    g2.fillOval(x4, y4, cabeza, cabeza);
    g2.fillRect(x4+4, y4+10, cuerpo-5, cuerpo+10);
    //manos
    g2.drawLine(x4+4, y4+15, x4+mpiezd4, y4+25);
    g2.drawLine(x4+5, y4+15, x4+mpiezd4, y4+25);
    //piez
    g2.drawLine(x4+5, y4+26, x4+10+mpiezi4, y4+35);
    g2.drawLine(x4+5, y4+27, x4+11+mpiezi4, y4+35);
    g2.drawLine(x4+4, y4+26, x4+mpiezd4, y4+35);
    g2.drawLine(x4+4, y4+27, x4+mpiezd4, y4+35);
    }
}
