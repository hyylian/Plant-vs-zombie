package PvZ;

import java.awt.Graphics;

public class Flower {
    int x;
    int y;
    int turn;
    int type;
    float chenh;
    public Flower(int x,int y,int type){
        this.x=x;
        this.y=y;
        this.type=type;
        
    }
    public void Draw(Graphics g){
          g.drawImage(Data.sun, x, y, null);
    }
    public void update(){
        switch(type){
        case 1:
        	if(y<770) y+=5;
        	else turn++;
        	break;
        case 2:
        	turn ++;
        	break;
        case 3:
        	x-=3;
        	y-=3;
        	if(x<=0){
        		x=0;
        	}
        	if(y<=0){
        		y=0;
        	}
        }
        
    }
}
