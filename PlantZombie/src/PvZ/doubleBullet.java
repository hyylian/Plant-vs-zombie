package PvZ;

import java.awt.Graphics;


public class doubleBullet {
     public int X;
     public int y;
     public int x11;
     public int x12;
     public int x21;
     public int x22;
     static int distance=1000;
     
    int speed=50;

    public doubleBullet(int X, int y) {
        this.X = X;
        this.y = y;
        
        x11=X;
        x12=x11-100;
        x21=X-distance;
        x22=x11-100;
    }

    
    

    
    
    public void update(){
        x11+=15;
        x12+=15;
        x21+=15;
        x22+=15;
        if(x11>=1600){
            x11=x21-distance;
        }
        if(x12>=1600){
            x12=x11-100;
        }
        if(x21>=1600){
            x21=x11-distance;   
        }
        if(x22>=1600){
            x22=x21-100;
        }
    }
    public void fly(Graphics g){
        if(x11>=X+15){
            g.drawImage(Data.b1, x11, y, null);
        }
        
        if(x12>=X+15){
            g.drawImage(Data.b1, x12, y, null);
        }
        if(x21>=X+15){
            g.drawImage(Data.b1, x21, y, null);
        }
        if(x22>=X+15){
            g.drawImage(Data.b1, x22, y, null);
        }
    }
}
