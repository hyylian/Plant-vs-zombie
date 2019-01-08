package PvZ;

import java.awt.Graphics;

public class flowerPlant {
    int x;
    int y;
    boolean sum=false;
    int turn;
    int hp;
    int positionX;
    int positionY;
    public flowerPlant(int x, int y,int positionX,int positionY) {
        this.x = x;
        this.y = y;
        this.positionX=positionX;
        this.positionY=positionY;
        turn=0;
        hp=1000;
    }
    public void update(){
        turn++;
    }
    
    public void Draw(Graphics g){
        g.drawImage(Data.flow.getCurrentImage(), x, y,null);
    }
}
