package PvZ;

import java.awt.Graphics;

public class Bullet {
     public int x1;
     public int x2;
     public int X;
     public int y;
     public static int distance=1000;
     public int speed=30;
    

    
     public Bullet(int X,int y){
    	 this.X=X;
    	 this.y=y;
        
    	 x1=X;
    	 x2=X-distance;
     }

     public int Distance() {
    	 return distance;
     }
     public void update(){
    	 x1+=15;
    	 x2+=15;
    	 if(x1>=1600){
    		 x1=x2-distance;
    	 }
    	 if(x2>=1600){
    		 x2=x1-distance;
    	 }
     }
     public void fly(Graphics g){
    	 if(x1>=X+15){
    		 g.drawImage(Data.b1, x1, y, null);
    	 }
    	 
    	 if(x2>=X+15){
    		 g.drawImage(Data.b1, x2, y, null);
    	 }
     }
}
