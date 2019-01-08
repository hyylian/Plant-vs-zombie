package PvZ;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class PvZ extends JFrame  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3232277261048908924L;
	Plants plants;
    static ArrayList<Peashooter> plant= new ArrayList<>();
    static ArrayList<Bullet> bullet= new ArrayList<>();
    static ArrayList<Peashooter2> Peashooter2 = new ArrayList<>();
    static ArrayList<doubleBullet> doublebullet= new ArrayList<>();
    static ArrayList<wallPlant> wall = new ArrayList<>();
    static ArrayList<flowerPlant> flowers=new ArrayList<>();
    static int bg[][] = new int[5][9];
    long t9=17;
    int bgX;
    int bgY;
    static int sun=1000;
    static int choice;
    static boolean pause=false;
    static boolean win=false;
    static boolean lose=false;
    static boolean cut=false;
    int toaX;
    int toaY;
    public PvZ(){
        plants =new Plants();
        this.setSize(1600,950);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(plants);
        this.setLayout(null);
        this.addMouseListener(new handler());
        this.addMouseMotionListener(new handler());
        this.addKeyListener(new handler());
        this.setVisible(true);
    }
    public static void main(String[] args) {
    	System.out.println("Start the game");
        PvZ pz=new PvZ();
    }
    
    private class handler implements MouseListener,MouseMotionListener,KeyListener{

    	@Override
    	public void mouseClicked(MouseEvent e) {
    		try {for(int i=0;i<Plants.flow.size();i++){
    			if(e.getX()>=Plants.flow.get(i).x && e.getX()<=Plants.flow.get(i).x+100 && e.getY()>= Plants.flow.get(i).y && e.getY()<=Plants.flow.get(i).y + 100){
                  
    				Plants.flow.get(i).type=3;
    				sun+=25;
                 
    			}
            
    		}
            
    		} catch (Exception ex) {}
    	}

    @Override
    public void mousePressed(MouseEvent e) {
        
    	if( e.getX()>=0 && e.getX()<=156 && e.getY()>=110 && e.getY()<=210
    			||e.getX()>=0 && e.getX()<=156 && e.getY()>=265 && e.getY()<=365
    			||e.getX()>=0 && e.getX()<=156 && e.getY()>=380 && e.getY()<=480
    			||e.getX()>=0 && e.getX()<=156 && e.getY()>=495 && e.getY()<=595){
    		Plants.run=!Plants.run;
    		if(e.getX()>=0 && e.getX()<=156 && e.getY()>=110 && e.getY()<=210)
    			choice=1;
    		else if(e.getX()>=0 && e.getX()<=156 && e.getY()>=265 && e.getY()<=365)
    			choice=2;
    		else if(e.getX()>=0 && e.getX()<=156 && e.getY()>=380 && e.getY()<=480)
    			choice=3;
    		else if(e.getX()>=0 && e.getX()<=156 && e.getY()>=495 && e.getY()<=595)
    			choice=4;
    	}
    	if( e.getX()>=150 && e.getX()<=205 && e.getY()>=872 && e.getY()<=908 )
    		cut=!cut;	
           
          
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
        	if(Plants.run){
        		Plants.run=!Plants.run;
        		if(e.getX()>=310-15 && e.getX()<=1498-15 && e.getY()>=205-50 && e.getY()<=940-50){
        			if(e.getX()>=310-15 && e.getX()<=440-15){
        				toaX=335; //345
        				bgY=0;
        			}
        			if(e.getX()>=441-15 && e.getX()<=572-15){
        				toaX=466;
        				bgY=1;
        			}
        			if(e.getX()>=573-15 && e.getX()<=700-15){
        				toaX=597;
        				bgY=2;
        			}
        			if(e.getX()>=701-15 && e.getX()<=835-15){
        				toaX=728;
        				bgY=3;
        			}
        			if(e.getX()>=836-15 && e.getX()<=968-15){
        				toaX=859;
        				bgY=4;
        			}
        			if(e.getX()>=969-15 && e.getX()<=1097-15){
        				toaX=990;
        				bgY=5;
        			}
        			if(e.getX()>=1097-15 && e.getX()<=1230-15){
        				toaX=1121;
        				bgY=6;
        			}
        			if(e.getX()>=1231-15 && e.getX()<=1357-15){
        				toaX=1252;
        				bgY=7;
        			}
        			if(e.getX()>=1358-15 && e.getX()<=1498-15){
        				toaX=1383;
        				bgY=8;
        			}
                
                
        			if(e.getY()>=205-50 && e.getY()<=353-50){
        				toaY=170;//140 - 170 
        				bgX=0;
        			}
        			if(e.getY()>=354-50 && e.getY()<=500-50){
        				toaY=320;//290
        				bgX=1;
        			}
        			if(e.getY()>=501-50 && e.getY()<=645-50){
        				toaY=465;//435
        				bgX=2;
        			}
        			if(e.getY()>=646-50 && e.getY()<=792-50){
        				toaY=620;//590
        				bgX=3;
        			}
        			if(e.getY()>=793-50 && e.getY()<=940-50){
        				toaY=775;//745
        				bgX=4;
        			}
        		switch(choice){
        		case 1:
                    if(bg[bgX][bgY]==0){
                        if(sun>=100){
                        	Peashooter p=new Peashooter(toaX,toaY,bgX,bgY);
                        	Bullet b=new Bullet(toaX+5,toaY);
                        	bullet.add(b);
                        	plant.add(p);
                        	sun-=100;
                        	bg[bgX][bgY]=1;
                        }
                    }
                    break;
        		case 2:
        			if(bg[bgX][bgY]==0){
                    	if(sun>=150){
                    		Peashooter2 p=new Peashooter2(toaX,toaY,bgX,bgY);
                    		doubleBullet b=new doubleBullet(toaX+5,toaY);
                    		Peashooter2.add(p);
                    		doublebullet.add(b);
                    		sun-=150;
                    		bg[bgX][bgY]=1;
                    	}   
                    }
                    break;
                case 3:
                	if(bg[bgX][bgY]==0){
                		if(sun>=50){
                        wallPlant p=new wallPlant(toaX,toaY,bgX,bgY);
                        wall.add(p);
                        sun-=50;
                        bg[bgX][bgY]=1;
                		}    
                    }
                    break;
                case 4:
                    if(bg[bgX][bgY]==0){
                        if(sun>=50){
                        flowerPlant f=new flowerPlant(toaX,toaY,bgX,bgY);
                        flowers.add(f);
                        sun-=50;
                        bg[bgX][bgY]=1;
                        }    
                    }
                    break; 
        		}
        		}  
        	}    
        } catch (Exception ex) {}
        
            
        if(cut){
        	cut=!cut;
        	for(int i=0;i<plant.size();i++){
            	if(e.getX()>=plant.get(i).x && e.getX()<=plant.get(i).x+81 && e.getX()>=plant.get(i).y && e.getX()<=plant.get(i).y+91){
                         plant.remove(i);
                }
            }
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
       if(Plants.run){
            plants.setX(e.getX()-13);
            plants.setY(e.getY()-40);
        }
       if(cut){
           Plants.setX1(e.getX());
           plants.setY1(e.getY());
           
       }
         //System.out.println(e.getPoint());  
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       //System.out.println(e.getPoint());
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
     public void keyPressed(KeyEvent e) {
    	if(e.getKeyCode()==KeyEvent.VK_SPACE){
    		pause=!pause;
        }
     }

     @Override
     public void keyReleased(KeyEvent e) {}
  }
}
