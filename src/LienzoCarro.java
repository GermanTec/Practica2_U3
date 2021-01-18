
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
public class LienzoCarro{
    private int Carro1x=250;
    private int Carro1y=500;
    private int llantax1C1=255;
    private int llantay1C1=495;
    private int llantax2C1=280;
    private int llantay2C1=495;
    private int llantax3C1=255;
    private int llantay3C1=530;
    private int llantax4C1=280;
    private int llantay4C1=530;
    private int techoxC1=255;
    private int techoyC1=505;
    
    private int Carro2x=360;
    private int Carro2y=300;
    private int llantax1C2=357;
    private int llantay1C2=305;
    private int llantax2C2=385;
    private int llantay2C2=305;
    private int llantax3C2=357;
    private int llantay3C2=330;
    private int llantax4C2=385;
    private int llantay4C2=330;
    private int techoxC2=365;
    private int techoyC2=305;
    
    private int Carro3x=550;
    private int Carro3y=420;
    private int llantax1C3=555;
    private int llantay1C3=450;
    private int llantax2C3=585;
    private int llantay2C3=450;
    private int llantax3C3=555;
    private int llantay3C3=415;
    private int llantax4C3=585;
    private int llantay4C3=415;
    private int techoxC3=575;
    private int techoyC3=425;
    
    private int Carro4x=440;
    private int Carro4y=600;
    private int llantax1C4=437;
    private int llantay1C4=615;
    private int llantax2C4=465;
    private int llantay2C4=615;
    private int llantax3C4=437;
    private int llantay3C4=640;
    private int llantax4C4=465;
    private int llantay4C4=640;
    private int techoxC4=445;
    private int techoyC4=625;
    
    public HiloSemaforo h=new HiloSemaforo(null,this,null);
    private int areax=250;
    private int areay=310;
    private int ancho=290;
    private int alto=275;

    
Timer t=new Timer(100,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Carro1x+=5;
        llantax1C1+=5;
        llantax2C1+=5;
        llantax3C1+=5;
        llantax4C1+=5;
        techoxC1+=5;
        if(Carro1x>=890){
        Carro1x=-5;
        llantax1C1=0;
        llantax2C1=25;
        llantax3C1=0;
        llantax4C1=25;
        techoxC1=0;
    }
    }
});

Timer t2=new Timer(100,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Carro2y+=5;
        llantay1C2+=5;
        llantay2C2+=5;
        llantay3C2+=5;
        llantay4C2+=5;
        techoyC2+=5;
        if (Carro2y>=700) {
            Carro2y=-5;
            llantay1C2=0;
            llantay2C2=0;
            llantay3C2=25;
            llantay4C2=25;
            techoyC2=0;
            
    }
    }
});
Timer t3=new Timer(100,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Carro3x-=5;
        llantax1C3-=5;
        llantax2C3-=5;
        llantax3C3-=5;
        llantax4C3-=5;
        techoxC3-=5;
        if (Carro3x<=0) {
            Carro3x=900;
            llantax1C3=905;
            llantax2C3=935;
            llantax3C3=905;
            llantax4C3=935;
            techoxC3=925;
            
    }
    }
}); 
Timer t4=new Timer(100,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Carro4y-=5;
        llantay1C4-=5;
        llantay2C4-=5;
        llantay3C4-=5;
        llantay4C4-=5;
        techoyC4-=5;
        if (Carro4y<=0) {
            Carro4y=705;
            llantay1C4=710;
            llantay2C4=710;
            llantay3C4=745;
            llantay4C4=745;
            techoyC4=730;
            
            
    }
    }
}); 

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

    public LienzoCarro(){
        h.start();
    }
    
    public void dibujarCarro(Graphics g2){
    if (llegoArea(Carro1x, Carro1y) && h.semaforo==3) {
            t.stop();
            
    }
    if (llegoArea(Carro1x,Carro1y)&& h.semaforo==2) {
            t.stop();
    }
    if (h.semaforo==1) {
            t.start();
    }
    //llantas
    g2.setColor(Color.BLACK);
    g2.fillRect(llantax1C1, llantay1C1, 18, 15);
    g2.fillRect(llantax2C1, llantay2C1, 18, 15);
    g2.fillRect(llantax3C1, llantay3C1, 18, 15);
    g2.fillRect(llantax4C1, llantay4C1, 18, 15);
    //cuerpo
    g2.setColor(Color.red);
    g2.fillRect(Carro1x, Carro1y, 60, 40);
    //techo
    g2.setColor(Color.BLACK);
    g2.fillRect(techoxC1, techoyC1, 30, 30);
    
    
    if (llegoArea(Carro2x, Carro2y) && h.semaforo2==3) {
            t2.stop();
    }
    if (llegoArea(Carro2x,Carro2y)&& h.semaforo2==2) {
            t2.stop();
    }
    if (h.semaforo2==1) {
            t2.start();
    }
    //llantas
    g2.setColor(Color.BLACK);
    g2.fillRect(llantax1C2, llantay1C2, 18, 15);
    g2.fillRect(llantax2C2, llantay2C2, 18, 15);
    g2.fillRect(llantax3C2, llantay3C2, 18, 15);
    g2.fillRect(llantax4C2, llantay4C2, 18, 15);
    //cuerpo
    g2.setColor(Color.ORANGE);
    g2.fillRect(Carro2x, Carro2y, 40, 60); 
    //techo
    g2.setColor(Color.BLACK);
    g2.fillRect(techoxC2, techoyC2, 30, 30);
    
    if (llegoArea(Carro3x, Carro3y) && h.semaforo==3) {
            t3.stop();
    }
    if (llegoArea(Carro3x,Carro3y)&& h.semaforo==2) {
            t3.stop();
    }
    if (h.semaforo==1) {
            t3.start();
    }
    //llantas
    g2.setColor(Color.BLACK);
    g2.fillRect(llantax1C3, llantay1C3, 18, 15);
    g2.fillRect(llantax2C3, llantay2C3, 18, 15);
    g2.fillRect(llantax3C3, llantay3C3, 18, 15);
    g2.fillRect(llantax4C3, llantay4C3, 18, 15);
    //cuerpo
    g2.setColor(Color.GRAY);
    g2.fillRect(Carro3x, Carro3y, 60, 40); 
    //techo
    g2.setColor(Color.BLACK);
    g2.fillRect(techoxC3, techoyC3, 30, 30);
    
    if (llegoArea(Carro4x, Carro4y) && h.semaforo2==3) {
            t4.stop();
    }
    if (llegoArea(Carro4x,Carro4y)&& h.semaforo2==2) {
            t4.stop();
    }
    if (h.semaforo2==1) {
            t4.start();
    }
    //llantas
    g2.setColor(Color.BLACK);
    g2.fillRect(llantax1C4, llantay1C4, 18, 15);
    g2.fillRect(llantax2C4, llantay2C4, 18, 15);
    g2.fillRect(llantax3C4, llantay3C4, 18, 15);
    g2.fillRect(llantax4C4, llantay4C4, 18, 15);
    //cuerpo
    g2.setColor(Color.BLUE);
    g2.fillRect(Carro4x, Carro4y, 40, 60); 
    //techo
    g2.setColor(Color.BLACK);
    g2.fillRect(techoxC4, techoyC4, 30, 30);
    
    }
    
}
