package PvZ;

import java.awt.Graphics;


public abstract class Zombie {
    int x;
    int y;
    int position;
    boolean run=false;
    boolean move=false;
    int hp;
    int damage;
    static int speed=125;
    
   
    public abstract void survive();
    public abstract void Draw(Graphics g );
    public abstract void update();
}
