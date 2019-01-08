package PvZ;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Data{
//    public static BufferedImage bufferedImage;   
    public static BufferedImage bg;
    
    public static Image Peashooter0;
    public static Image Peashooter1;
    public static Image Peashooter2;
    public static Image Peashooter3;
    public static Image Peashooter4;
    public static Image Peashooter5;
    public static Image Peashooter6;
    public static Image Peashooter7;
    public static Image Peashooter8;
    public static Image Peashooter9;
    public static Image Peashooter10;
    public static Image Peashooter11;
    public static Image Peashooter12;
    public static Image Peashooter13;
    public static Image Peashooter14;
    
    
    
    public static Image b1;
    public static Image def;
    public static Image xeng;
    public static Image xeng1;
    public static Image flower;
    public static Image flower1;
    public static Image flower2;
    
    public static Image zombiea1;
    public static Image zombiea2;
    public static Image zombiea3;
    public static Image zombiea4;
    public static Image zombiea5;
    public static Image zombiea6;
    public static Image zombiea7;
    public static Image zombiea8;
    public static Image zombiea9;
    
    public static Image sun;
    
    public static Image Ps1;
    public static Image Ps2;
    public static Image Ps3;
    public static Image Ps4;
    public static Image Ps5;
    public static Image Ps6;
    public static Image Ps7;
    public static Image Ps8;
    public static Image Ps9;
    public static Image Ps10;
    public static Image Ps11;
    public static Image Ps12;
    public static Image Ps13;
    
    public static Image wall1;
    public static Image wall2;
    public static Image wall3;
    public static Image wall4;
    public static Image wall5;
    public static Image wall6;
    public static Image wall7;
    public static Image wall8;
    public static Image wall9;
    public static Image wall10;
    public static Image wall11;
    public static Image wall12;
    
    public static Image wallc1;
    public static Image wallc2;
    public static Image wallc3;
    public static Image wallc4;
    public static Image wallc5;
    public static Image wallc6;
    
    public static Image card1;
    public static Image card2;
    public static Image card3;
    public static Image card4;
    public static Image card5;
    
    public static Animation pea;
    public static Animation flow;
    public static Animation peax2;
    public static Animation wallnut;
    public static Animation Zombiez;
    public static Animation Card;
    public static Animation wallnutcrack;
    
    public static void loadImage(){
        try {
//            bufferedImage=ImageIO.read(new File("imageres/pc.png"));
            xeng=ImageIO.read(new File("imageres/xeng.jpg"));
            
            Ps1=ImageIO.read(new File("imageres/Peashooter2/01.png"));
            Ps2=ImageIO.read(new File("imageres/Peashooter2/02.png"));
            Ps3=ImageIO.read(new File("imageres/Peashooter2/03.png"));
            Ps4=ImageIO.read(new File("imageres/Peashooter2/04.png"));
            Ps5=ImageIO.read(new File("imageres/Peashooter2/05.png"));
            Ps6=ImageIO.read(new File("imageres/Peashooter2/06.png"));
            Ps7=ImageIO.read(new File("imageres/Peashooter2/07.png"));
            Ps8=ImageIO.read(new File("imageres/Peashooter2/08.png"));
            Ps9=ImageIO.read(new File("imageres/Peashooter2/09.png"));
            Ps10=ImageIO.read(new File("imageres/Peashooter2/10.png"));
            Ps11=ImageIO.read(new File("imageres/Peashooter2/11.png"));
            Ps12=ImageIO.read(new File("imageres/Peashooter2/12.png"));
            Ps13=ImageIO.read(new File("imageres/Peashooter2/13.png"));
//            Ps14=ImageIO.read(new File("imageres/Peashooter_2/17.png"));
            
            wall1=ImageIO.read(new File("imageres/wallnut/1.png"));
            wall2=ImageIO.read(new File("imageres/wallnut/2.png"));
            wall3=ImageIO.read(new File("imageres/wallnut/3.png"));
            wall4=ImageIO.read(new File("imageres/wallnut/4.png"));
            wall5=ImageIO.read(new File("imageres/wallnut/5.png"));
            wall6=ImageIO.read(new File("imageres/wallnut/6.png"));
            wall7=ImageIO.read(new File("imageres/wallnut/7.png"));
            wall8=ImageIO.read(new File("imageres/wallnut/8.png"));
            wall9=ImageIO.read(new File("imageres/wallnut/9.png"));
            wall10=ImageIO.read(new File("imageres/wallnut/10.png"));
            wall11=ImageIO.read(new File("imageres/wallnut/11.png"));
            wall12=ImageIO.read(new File("imageres/wallnut/12.png"));
            
            wallc1=ImageIO.read(new File("imageres/wallnutc/1.png"));
            wallc2=ImageIO.read(new File("imageres/wallnutc/2.png"));
            wallc3=ImageIO.read(new File("imageres/wallnutc/3.png"));
            wallc4=ImageIO.read(new File("imageres/wallnutc/4.png"));
            wallc5=ImageIO.read(new File("imageres/wallnutc/5.png"));
            wallc6=ImageIO.read(new File("imageres/wallnutc/6.png"));

            def=ImageIO.read(new File("imageres/boss.png"));
            
            flower=ImageIO.read(new File("imageres/f1.png"));
            flower1=ImageIO.read(new File("imageres/f2.png"));
            flower2=ImageIO.read(new File("imageres/f3.png"));
            

            Peashooter0=ImageIO.read(new File("imageres/Peashooter/01.png"));
            Peashooter1=ImageIO.read(new File("imageres/Peashooter/02.png"));
            Peashooter2=ImageIO.read(new File("imageres/Peashooter/03.png"));
            Peashooter3=ImageIO.read(new File("imageres/Peashooter/04.png"));
            Peashooter4=ImageIO.read(new File("imageres/Peashooter/05.png"));
            Peashooter5=ImageIO.read(new File("imageres/Peashooter/06.png"));
            Peashooter6=ImageIO.read(new File("imageres/Peashooter/07.png"));
            Peashooter7=ImageIO.read(new File("imageres/Peashooter/08.png"));
            Peashooter8=ImageIO.read(new File("imageres/Peashooter/09.png"));
            Peashooter9=ImageIO.read(new File("imageres/Peashooter/10.png"));
            Peashooter10=ImageIO.read(new File("imageres/Peashooter/11.png"));
            Peashooter11=ImageIO.read(new File("imageres/Peashooter/12.png"));
            Peashooter12=ImageIO.read(new File("imageres/Peashooter/13.png"));
            Peashooter13=ImageIO.read(new File("imageres/Peashooter/17.png"));
            

            zombiea1=ImageIO.read(new File("imageres/Zombie1/1.png"));
            zombiea2=ImageIO.read(new File("imageres/Zombie1/2.png"));
            zombiea3=ImageIO.read(new File("imageres/Zombie1/3.png"));
            zombiea4=ImageIO.read(new File("imageres/Zombie1/4.png"));
            zombiea5=ImageIO.read(new File("imageres/Zombie1/5.png"));
            zombiea6=ImageIO.read(new File("imageres/Zombie1/6.png"));
            zombiea7=ImageIO.read(new File("imageres/Zombie1/7.png"));
            zombiea8=ImageIO.read(new File("imageres/Zombie1/8.png"));
            zombiea9=ImageIO.read(new File("imageres/Zombie1/9.png"));
            
            b1=ImageIO.read(new File("imageres/pea.png"));
            
            bg=ImageIO.read(new File("imageres/Map_1.jpg"));
            bg=bg.getSubimage(750,250,1950,1250);
            
            sun=ImageIO.read(new File("imageres/sun.png"));
            
            card1=ImageIO.read(new File("imageres/Peashooter.png"));
            card2=ImageIO.read(new File("imageres/Peashooter2.png"));
            card3=ImageIO.read(new File("imageres/Wallnut.png"));
            card4=ImageIO.read(new File("imageres/Sunflower.png"));
            card5=ImageIO.read(new File("imageres/Template.png"));
            
        } catch (Exception e) {
        }
    }
    public static void loadAnimation(){
        pea=new Animation();
        pea.addImage(Peashooter0);
        pea.addImage(Peashooter1);
        pea.addImage(Peashooter2);
        pea.addImage(Peashooter3);
        pea.addImage(Peashooter4);
        pea.addImage(Peashooter5);
        pea.addImage(Peashooter6);
        pea.addImage(Peashooter7);
        pea.addImage(Peashooter8);
        pea.addImage(Peashooter9);
        pea.addImage(Peashooter10);
        pea.addImage(Peashooter11);
        pea.addImage(Peashooter12);
//        pea.addImage(Peashooter13);
      
        
        Zombiez=new Animation();
        Zombiez.addImage(zombiea1);
        Zombiez.addImage(zombiea2);
        Zombiez.addImage(zombiea3);
        Zombiez.addImage(zombiea4);
        Zombiez.addImage(zombiea5);
        Zombiez.addImage(zombiea6);
        Zombiez.addImage(zombiea7);
        Zombiez.addImage(zombiea8);
        Zombiez.addImage(zombiea9);
        
        peax2=new Animation();
        peax2.addImage(Ps1);
        peax2.addImage(Ps2);
        peax2.addImage(Ps3);
        peax2.addImage(Ps4);
        peax2.addImage(Ps5);
        peax2.addImage(Ps6);
        peax2.addImage(Ps7);
        peax2.addImage(Ps8);
        peax2.addImage(Ps9);
        peax2.addImage(Ps10);
        peax2.addImage(Ps11);
        peax2.addImage(Ps12);
        peax2.addImage(Ps13);
        
        wallnut =new Animation();
        wallnut.addImage(wall1);
        wallnut.addImage(wall2);
        wallnut.addImage(wall3);
        wallnut.addImage(wall4);
        wallnut.addImage(wall5);
        wallnut.addImage(wall6);
        wallnut.addImage(wall7);
        wallnut.addImage(wall8);
        wallnut.addImage(wall9);
        wallnut.addImage(wall10);
        wallnut.addImage(wall11);
        wallnut.addImage(wall12);
        
        wallnutcrack=new Animation();
        wallnutcrack.addImage(wallc1);
        wallnutcrack.addImage(wallc2);
        wallnutcrack.addImage(wallc3);
        wallnutcrack.addImage(wallc4);
        wallnutcrack.addImage(wallc5);
        wallnutcrack.addImage(wallc6);
        
        
        flow=new Animation();
        flow.addImage(flower);
        flow.addImage(flower1);
        flow.addImage(flower2);
        
        
    }
    
}
