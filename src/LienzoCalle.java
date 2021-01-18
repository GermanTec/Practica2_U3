
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class LienzoCalle {
    
    public LienzoCalle(){
    
    }
    
    public void dibujarCalle(Graphics g2){
    //Calle
    
    g2.setColor(Color.DARK_GRAY);
    g2.fillRect(0, 400, 900, 150);
    g2.fillRect(350, 0, 150, 700);
    //Lineas blancas
    g2.setColor(Color.WHITE);
    g2.fillRect(0, 470, 300, 10);
    g2.fillRect(420, 0, 10, 350);
    g2.fillRect(550, 470, 900, 10);
    g2.fillRect(420, 600, 10, 700);
    //Lineas punteadas Arriba
    g2.fillRect(360, 380, 10, 20);
    g2.fillRect(380, 380, 10, 20);
    g2.fillRect(400, 380, 10, 20);
    g2.fillRect(420, 380, 10, 20);
    g2.fillRect(440, 380, 10, 20);
    g2.fillRect(460, 380, 10, 20);
    g2.fillRect(480, 380, 10, 20);
    
    //Lineas Punteadas Abajo
    g2.fillRect(360, 550, 10, 20);
    g2.fillRect(380, 550, 10, 20);
    g2.fillRect(400, 550, 10, 20);
    g2.fillRect(420, 550, 10, 20);
    g2.fillRect(440, 550, 10, 20);
    g2.fillRect(460, 550, 10, 20);
    g2.fillRect(480, 550, 10, 20);
    
    //Lineas Punteadas Dere
    g2.fillRect(325, 410, 20, 10);
    g2.fillRect(325, 430, 20, 10);
    g2.fillRect(325, 450, 20, 10);
    g2.fillRect(325, 470, 20, 10);
    g2.fillRect(325, 490, 20, 10);
    g2.fillRect(325, 510, 20, 10);
    g2.fillRect(325, 530, 20, 10);
    
    //Lineas Punteadas Izq
    g2.fillRect(505, 410, 20, 10);
    g2.fillRect(505, 430, 20, 10);
    g2.fillRect(505, 450, 20, 10);
    g2.fillRect(505, 470, 20, 10);
    g2.fillRect(505, 490, 20, 10);
    g2.fillRect(505, 510, 20, 10);
    g2.fillRect(505, 530, 20, 10);
    }
}
