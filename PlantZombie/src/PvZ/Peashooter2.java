package PvZ;

import java.awt.Graphics;

public class Peashooter2 {
    int x;
    int y;
    int damage;
    int hp;
    int positionX;
    int positionY;
    public Peashooter2(int x , int y,int positionX,int positionY){
        this.x=x;
        this.y=y;
        this.positionX=positionX;
        this.positionY=positionY;
        damage=50;
        hp=1000;
    }
    public void Draw(Graphics g){
        g.drawImage(Data.peax2.getCurrentImage(), x, y, null);
    }
}
