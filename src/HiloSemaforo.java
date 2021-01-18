
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Orozco
 */
public class HiloSemaforo extends Thread {
    private boolean ejecutar=true;
    private boolean detener=false;
    public LienzoSemaforo puntero;
    public LienzoCarro puntero2;
    public LienzoPersonas puntero3;
    private int contador=0;
    private int contador2=0;
    public int semaforo2=0;
    public int semaforo=0;
    public HiloSemaforo(LienzoSemaforo p,LienzoCarro p2,LienzoPersonas p3){
    puntero=p;
    puntero2=p2;
    puntero3=p3;
    }

    @Override
    public void run() {
        while(ejecutar){
        try{
            contador++;
                    if (contador>=0&&contador<15) {
                        semaforo=1;
                        semaforo2=3;
                    }
                    if (contador>=15&&contador<20) {
                        semaforo=2;
                        semaforo2=2;
                    }
                    if (contador>=20){
                        semaforo=3;
                        semaforo2=1;
                
                    }if (contador==30){
                    contador=0;
                    //semaforo=0;
                    }
            
            sleep(1000);
                           
    }   catch (InterruptedException ex) {
            Logger.getLogger(HiloSemaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
    
}
