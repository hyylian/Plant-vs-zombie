package PvZ;

import java.awt.Graphics;


public class Peashooter{
    int x;
    int y;
    int damage;
    int speed;
    int hp;
    int positionX;
    int positionY;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Peashooter(int x,int y,int positionX,int positionY){
        this.x=x;
        this.y=y;
        this.positionX=positionX;
        this.positionY=positionY;
        speed=50;
        hp=1000;
        damage=100;
    }
    public void Draw(Graphics g){
        g.drawImage(Data.pea.getCurrentImage(), x, y, null);
        if(hp<=0) {
        	g.drawImage(Data.wallnut.getCurrentImage(), x, y, null);
        }
    }
    
}
