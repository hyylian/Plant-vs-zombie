package PvZ;

import java.awt.Graphics;

public class Zombie1 extends Zombie{
  
     
    
    public Zombie1(int y) {
        hp=1000;
        damage=250;
        
        x=1450;
        this.y=y;
        
    }
    
    @Override
    public void  Draw(Graphics g) {
    	if(hp>0)
    		g.drawImage(Data.Zombiez.getCurrentImage(), x, y, null);
    }

    @Override
    public void update() {
        if(move){
            x-=3;
        }
        
    }

    @Override
    public void survive() {
        
    }

    

  
    
}
