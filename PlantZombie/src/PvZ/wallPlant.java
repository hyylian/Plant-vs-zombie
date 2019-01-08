package PvZ;

import java.awt.Graphics;


public class wallPlant {
    int x;
    int y;
    int hp;
    int positionX;
    int positionY;

    public wallPlant(int x, int y,int positionX,int positionY) {
        this.x = x;
        this.y = y;
        this.positionX=positionX;
        this.positionY=positionY;
        hp=10000;
    }

    
   
    public void Draw(Graphics g){
    	if(hp>5000) {
    		g.drawImage(Data.wallnut.getCurrentImage(), x, y, null);
    	}
    	else if(hp<=5000){
    		g.drawImage(Data.wallnutcrack.getCurrentImage(),x,y,null);
    	}
    	
    }
}
