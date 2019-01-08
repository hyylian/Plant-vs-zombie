package PvZ;

import java.awt.Graphics;


public class def{
    int x;
    int y;
    public int speed=20;
    boolean run=false;
    public def(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void  update(){
        if(run){
            x+=5;
        }
    }
    public void Draw(Graphics g){
        g.drawImage(Data.def, x, y, null);
    }
}
