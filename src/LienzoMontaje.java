
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class LienzoMontaje extends Canvas implements MouseListener{
public LienzoCarro c;
public LienzoCalle ca;
public LienzoSemaforo s;
public LienzoPersonas p;
Image c1=new ImageIcon(getClass().getResource("/edificio2.png")).getImage();    
Image c2=new ImageIcon(getClass().getResource("/casa.png")).getImage();    
Image c3=new ImageIcon(getClass().getResource("/casa2.png")).getImage();   
Image c4=new ImageIcon(getClass().getResource("/arbol.png")).getImage();
public LienzoMontaje(){
    c=new LienzoCarro();
    ca=new LienzoCalle();
    s=new LienzoSemaforo(520,260);
    s.LienzoSemaforo2(280, 260);
    s.LienzoSemaforo3(280, 550);
    s.LienzoSemaforo4(520, 550);
    p=new LienzoPersonas();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
    Graphics2D g2=(Graphics2D)g; 
    g2.setColor(new Color(51,204,255));
    g2.fillRect(0, 0, 350, 360);
    g2.fillRect(500, 0, 400, 360);
    g2.setColor(Color.GREEN);
    g2.fillRect(0, 360, 350, 10);
    g2.fillRect(500, 360, 400, 10);
    g2.fillRect(0, 550, 350, 150);
    g2.fillRect(500, 550, 400, 150);
    g2.setColor(Color.YELLOW);
    g2.fillOval(-30, -30, 150, 150);
    g2.drawImage(c1, 100, 173, this);
    g2.drawImage(c2, 0, 290, this);
    g2.drawImage(c3,600, 290, this);
    g2.drawImage(c4, 60, 310, this);
    g2.drawImage(c4, 740, 310, this);
    g2.drawImage(c4, 560, 310, this);
    g2.drawImage(c2, 650, 287, this);
    g2.drawImage(c2, 700, 287, this);
    g2.drawImage(c1, 750, 173, this);
    g2.setColor(Color.LIGHT_GRAY);
    g2.fillRect(0, 370, 350, 30);
    g2.fillRect(500, 370, 400, 30);
    ca.dibujarCalle(g2);
    c.dibujarCarro(g2);
    s.dibujarSemaforo(g2);
    p.dibujarPersona(g2);
    repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
