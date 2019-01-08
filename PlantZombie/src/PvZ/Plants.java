package PvZ;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;


public class Plants extends JPanel implements Runnable{
        /**
	 * 
	 */
	private static final long serialVersionUID = 7280159465823595667L;

	static boolean run=false;
        	
	static  int x;
	static  int y;	
	static  int x1;
	static  int y1;
	SoundPlayer sl=new SoundPlayer(new File("imageres/sound/menu.wav"));
	static int score=0;
    static ArrayList<Zombie> zombie=new ArrayList<>();
    static ArrayList<Flower> flow=new ArrayList<>();
    static ArrayList<def> def =new ArrayList<>();
    Random r;
          long t,i=0;
          Bullet b;
          Zombie1 z1,z2,z3,z4,z5,z6,z7,z8,z9,z10,z11,z12,z13,z14,z15,z16,z17,z18,z19;
          def d1,d2,d3,d4,d5;
          Thread thread;
          public int lane1=140;
          public int lane2=290;
          public int lane3=435;
          public int lane4=590;
          public int lane5=745;
    
     public Plants(){
         thread =new Thread(this);
         this.setSize(1600,950);
         this.setBounds(0, 0, 1600,950);
         r=new Random();
         
         z1=new Zombie1(lane1);
         z2=new Zombie1(lane3);
         z3=new Zombie1(lane5);
         z4=new Zombie1(lane4);
         z5=new Zombie1(lane1);
         z6=new Zombie1(lane2);
         z7=new Zombie1(lane5);
         z8=new Zombie1(lane3);
         z9=new Zombie1(lane1);
         z10=new Zombie1(lane1);
         z11=new Zombie1(lane3);
         z12=new Zombie1(lane5);
         z13=new Zombie1(lane2);
         z14=new Zombie1(lane2);
         z15=new Zombie1(lane1);
         z16=new Zombie1(lane4);
         z17=new Zombie1(lane5);
         z18=new Zombie1(lane3);
         z19=new Zombie1(lane4);
         
         zombie.add(z1);
         zombie.add(z2);
         zombie.add(z3);
         zombie.add(z4);
         zombie.add(z5);
         zombie.add(z6);
         zombie.add(z7);
         zombie.add(z8);
         zombie.add(z9);
         zombie.add(z10);
         zombie.add(z11);
         zombie.add(z12);
         zombie.add(z13);
         zombie.add(z14);
         zombie.add(z15);
         zombie.add(z16);
         zombie.add(z17);
         zombie.add(z18);
         zombie.add(z19);
         
         
         d1 =new def(200,lane1);
         d2 =new def(200,lane2);
         d3 =new def(200,lane3);
         d4 =new def(200,lane4);
         d5 =new def(200,lane5);
         zombie.add(z1);
         zombie.add(z2);
         zombie.add(z3);
         zombie.add(z4);
         zombie.add(z5);
         def.add(d1);
         def.add(d2);
         def.add(d3);
         def.add(d4);
         def.add(d5);
         
         
         
         
         Data.loadImage();
         Data.loadAnimation();
         
         thread.start();
     }

   
     
     public void paint(Graphics g){
         
         g.drawImage(Data.bg.getScaledInstance(1600,950, Data.bg.SCALE_SMOOTH), 0,0, null);
         
         g.drawImage(Data.sun, 0, 0, null);
         g.drawImage(Data.card1.getScaledInstance(156,99, Data.card1.SCALE_SMOOTH), 0,110, null);//120-76
         g.drawImage(Data.card2.getScaledInstance(156,99, Data.card2.SCALE_SMOOTH), 0,225, null);
         g.drawImage(Data.card3.getScaledInstance(156,99, Data.card3.SCALE_SMOOTH), 0,340, null);
         g.drawImage(Data.card4.getScaledInstance(156,99, Data.card4.SCALE_SMOOTH), 0,455, null);
         g.drawImage(Data.card5.getScaledInstance(156,99, Data.card5.SCALE_SMOOTH), 0,570, null);
         g.drawImage(Data.xeng,150 ,850, null);
         for(Zombie h: zombie){
             if(h.run){
                 h.Draw(g);
             }
         }
         if(run){
             
             ve(g);
         }
         if(PvZ.cut){
             cut(g);
         }
         
         for(Peashooter z: PvZ.plant){
                 z.Draw(g);
         }
         for(Peashooter2 z: PvZ.Peashooter2){
                 z.Draw(g);
         }
         for(Bullet b: PvZ.bullet){
                 b.fly(g);
         }
         for(doubleBullet b: PvZ.doublebullet){
                 b.fly(g);
         }
         for(wallPlant w: PvZ.wall){
                 w.Draw(g);
         }
         for(flowerPlant f:PvZ.flowers){
                 f.Draw(g);
         }
         
         for(Flower f:flow){
             f.Draw(g);
         }
         for(def c: def){
             c.Draw(g);
         }
         
         g.setColor(Color.black);
         g.setFont(new Font("fbUsv8C5el",Font.BOLD,40));
         g.drawString(" "+PvZ.sun ,70,55);
         g.setColor(Color.red);
         g.setFont(new Font("fbUsv8C5el",Font.BOLD,40));
         g.drawString(" SCORE: "+score,250,55);
         if(PvZ.pause){
             g.setColor(Color.black);
             g.setFont(new Font("fbUsv8C5el",Font.BOLD,70));
             g.drawString("PAUSED",750,450);
         }
         if(PvZ.win){
             g.setColor(Color.black);
             g.setFont(new Font("fbUsv8C5el",Font.BOLD,75));
             g.drawString("YOU WIN!!! "+"YOUR SCORE: "+score,300,200);
         }
         if(PvZ.lose){
             g.setColor(Color.black);
             g.setFont(new Font("fbUsv8C5el",Font.BOLD,75));
             g.drawString("YOU LOSE! YOUR SCORE: "+score,300, 200);
         }
         
        
     }
     
   public void ve(Graphics g){
        switch(PvZ.choice){
            case 1:
                g.drawImage(Data.Peashooter0, x,y, null);
                break;
            case 2:
                g.drawImage(Data.Ps1, x,y, null);
                break;
            case 3:
                g.drawImage(Data.wall1, x,y, null);
                break;
                
            case 4:
                g.drawImage(Data.flower, x,y, null);
                break;
        }
        
     }
   public void cut(Graphics g){
        g.drawImage(Data.xeng, x1,y1, null);
     }

    @Override
    public void run() {
        long t1=0;
        long t2=0;
        long t3=10000;
        long t4=0;
        long t5=0;
        long t7=0;
        long t8=0;
        long t9=0;
        while(true){
        	if(System.currentTimeMillis()-t9 > 17000) {
        		sl.play();
        		t9=System.currentTimeMillis();
        	}     
        	if(!PvZ.pause){
        		if(System.currentTimeMillis()-t8>2){
        			for(int z=0;z<flow.size();z++){
        				if(flow.get(z).type==3){
        					flow.get(z).update();
        					if(flow.get(z).x==0 && flow.get(z).y==0){
        						flow.remove(z);
        					}
        				}
        			}
        			t8=System.currentTimeMillis();
        		}
        		if(System.currentTimeMillis()-t1>190){
        			Data.pea.update();
        			Data.wallnut.update();
        			Data.peax2.update();
        			Data.flow.update();
        			Data.Zombiez.update();
        			t1=System.currentTimeMillis();
        		}
        		if(System.currentTimeMillis()-t5>20){
        			for(int z=0;z<def.size();z++){
        				def.get(z).update();
        				if(def.get(z).x>=1600){
        					def.remove(z);
        				}
        			}
        			t5=System.currentTimeMillis();
        		}
        		if(System.currentTimeMillis()-t4>10000){
        			
        			int position=r.nextInt(10);
                
        			Flower f=new Flower(position*100+350,50,1);
        			flow.add(f);
        			t4=System.currentTimeMillis();
        		}
        		if(System.currentTimeMillis()-t7>2000){
        			for(int z=0;z<PvZ.flowers.size();z++){
        				PvZ.flowers.get(z).update();
        				if(PvZ.flowers.get(z).turn==5 ){
        					Flower fly = new Flower(PvZ.flowers.get(z).x+10,PvZ.flowers.get(z).y+50,2);
        					flow.add(fly);
        					PvZ.flowers.get(z).turn=0;
        				}
        			}
        			t7=System.currentTimeMillis();
        		}
        		
        		if(System.currentTimeMillis()-t3>15000){
                            
        			for(int z=0;z<zombie.size();z++){
        				if(zombie.get(z).run==false){
        					zombie.get(z).run=true;
        					break;
        				}
        			}
        			t3=System.currentTimeMillis()-10000;
        		}
            
          
        		try {
        			if(System.currentTimeMillis()-t2>Zombie.speed){
        				for(Bullet b: PvZ.bullet){
        					b.update();
        				} 
        				for(doubleBullet b: PvZ.doublebullet){
        					b.update();
        				}
        				for(int u=0;u<zombie.size();u++){
        					int c=0;
        					if(zombie.get(u).move){ 
        						zombie.get(u).update();
        					}	
                          
        					for(int z=0;z<PvZ.bullet.size();z++){
        						if(zombie.get(u).x<=PvZ.bullet.get(z).x1 && zombie.get(u).x+100>=PvZ.bullet.get(z).x1 && PvZ.bullet.get(z).y-30==zombie.get(u).y
        								||zombie.get(u).x<=PvZ.bullet.get(z).x2 && zombie.get(u).x+100>=PvZ.bullet.get(z).x2  && PvZ.bullet.get(z).y-30==zombie.get(u).y){
        							switch(1){
        							case 1:if(PvZ.bullet.get(z).x1>=PvZ.bullet.get(z).X){
        								if(zombie.get(u).x<=PvZ.bullet.get(z).x1 && zombie.get(u).x+100>=PvZ.bullet.get(z).x1&& PvZ.bullet.get(z).y-30==zombie.get(u).y){
        									zombie.get(u).hp-=PvZ.plant.get(z).damage;
        									if(zombie.get(u).hp<=0){
        										zombie.remove(u);
        										score+=100;
        									}	
        									PvZ.bullet.get(z).x1=PvZ.bullet.get(z).x2-PvZ.bullet.get(z).distance;
        								}
        							}
        							case 2:if(PvZ.bullet.get(z).x2>=PvZ.bullet.get(z).X){
        								if(zombie.get(u).x<=PvZ.bullet.get(z).x2 && zombie.get(u).x+106>=PvZ.bullet.get(z).x2&& PvZ.bullet.get(z).y-30==zombie.get(u).y){
        									zombie.get(u).hp-=PvZ.plant.get(z).damage;
        									if(zombie.get(u).hp<=0){
        										zombie.remove(u);
        										score+=100;
        									}
        									PvZ.bullet.get(z).x2=PvZ.bullet.get(z).x1-PvZ.bullet.get(z).distance;
        									
        								}
        								
        							}
        							}	
        						}
        					} 
        					for(int z=0;z<PvZ.doublebullet.size();z++){
        						
        						if(zombie.get(u).x<=PvZ.doublebullet.get(z).x11 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x11 && PvZ.doublebullet.get(z).y-30==zombie.get(u).y
        								||zombie.get(u).x<=PvZ.doublebullet.get(z).x12 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x12  && PvZ.doublebullet.get(z).y-30==zombie.get(u).y
        								||zombie.get(u).x<=PvZ.doublebullet.get(z).x21 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x21 && PvZ.doublebullet.get(z).y-30==zombie.get(u).y    
        								||zombie.get(u).x<=PvZ.doublebullet.get(z).x22 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x22 && PvZ.doublebullet.get(z).y-30==zombie.get(u).y    ){
        							switch(1){
        							case 1:if(PvZ.doublebullet.get(z).x11>=PvZ.doublebullet.get(z).X){
        								if(zombie.get(u).x<=PvZ.doublebullet.get(z).x11 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x11){
        									zombie.get(u).hp-=PvZ.Peashooter2.get(z).damage;
        									
        									if(zombie.get(u).hp<=0){
        										zombie.remove(u);
        										score+=100;
        									}
        									PvZ.doublebullet.get(z).x11=PvZ.doublebullet.get(z).x21-PvZ.doublebullet.get(z).distance;
                                                
        								}//
        							}
        							case 2:if(PvZ.doublebullet.get(z).x12>=PvZ.doublebullet.get(z).X){
        								if(zombie.get(u).x<=PvZ.doublebullet.get(z).x12 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x12){
        									zombie.get(u).hp-=PvZ.Peashooter2.get(z).damage;
        									if(zombie.get(u).hp<=0){
        										zombie.remove(u);
        										score+=100;
        									}
        									PvZ.doublebullet.get(z).x12=PvZ.doublebullet.get(z).x11-100;
        									
        									
        									
        									
        								}
        							}
        							
        							
        							case 3:if(PvZ.doublebullet.get(z).x21>=PvZ.doublebullet.get(z).X){
        								if(zombie.get(u).x<=PvZ.doublebullet.get(z).x21 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x21){
        									zombie.get(u).hp-=PvZ.Peashooter2.get(z).damage;
        									if(zombie.get(u).hp<=0){
        										zombie.remove(u);
        										score+=100;
        									}
        									PvZ.doublebullet.get(z).x21=PvZ.doublebullet.get(z).x11-PvZ.doublebullet.get(z).distance;
        								}    
        							}
        								
        							case 4:if(PvZ.doublebullet.get(z).x22>=PvZ.doublebullet.get(z).X){
        								if(zombie.get(u).x<=PvZ.doublebullet.get(z).x11 && zombie.get(u).x+106>=PvZ.doublebullet.get(z).x11){
        									zombie.get(u).hp-=PvZ.Peashooter2.get(z).damage;
        									if(zombie.get(u).hp<=0){
        										zombie.remove(u);
        										score+=100;
        									}
        									PvZ.doublebullet.get(z).x22=PvZ.doublebullet.get(z).x21-100;
        								}
        							}
	        							}
        							}
        					}
        					for(int z=0;z<PvZ.wall.size();z++){
        						if(zombie.get(u).x<=PvZ.wall.get(z).x+75 && zombie.get(u).x>=PvZ.wall.get(z).x+50 && PvZ.wall.get(z).y-30==zombie.get(u).y ){
        							zombie.get(u).move=false;
        							c=1;
        							PvZ.wall.get(z).hp-=zombie.get(u).damage;
        							if(PvZ.wall.get(z).hp<=0){
        								PvZ.bg[PvZ.wall.get(z).positionX][PvZ.wall.get(z).positionY]=0;
        								PvZ.wall.remove(z);
        							}
        						}
        					}
                          
            /*              for(int z=0;z<PvZ.wall.size();z++){
                              if(zombie.get(u).x<=PvZ.wall.get(z).x+75 && zombie.get(u).x>=PvZ.wall.get(z).x+50 && PvZ.wall.get(z).y-30==zombie.get(u).y ){
                                      zombie.get(u).move=false;
                                      c=1;
                                       PvZ.wall.get(z).hp-=zombie.get(u).damage;
                                     if(PvZ.wall.get(z).hp<=0){
                                         PvZ.bg[PvZ.wall.get(z).positionX][PvZ.wall.get(z).positionY]=0;
                                       PvZ.wall.remove(z);
                                       
                                       
                                   }
                          }
                          }*/
                          
        					for(int z=0;z<PvZ.flowers.size();z++){
        						if(zombie.get(u).x<=PvZ.flowers.get(z).x+75 && zombie.get(u).x>=PvZ.flowers.get(z).x+50 && PvZ.flowers.get(z).y-30==zombie.get(u).y){
                                	zombie.get(u).move=false;
                                	PvZ.flowers.get(z).hp-=zombie.get(u).damage;
                                	if(PvZ.flowers.get(z).hp<=0){
                                		PvZ.bg[PvZ.flowers.get(z).positionX][PvZ.flowers.get(z).positionY]=0;
                                		PvZ.flowers.remove(z);
                                		}
                                   c=1; 
        						}
        					} 
        					for(int z=0;z<PvZ.plant.size();z++){
        						if(zombie.get(u).x<=PvZ.plant.get(z).x+75 && zombie.get(u).x>=PvZ.plant.get(z).x+50 && PvZ.plant.get(z).y-30==zombie.get(u).y ){
        							zombie.get(u).move=false;
        							PvZ.plant.get(z).hp-=zombie.get(u).damage;
        							if(PvZ.plant.get(z).hp<=0){
        								PvZ.bg[PvZ.plant.get(z).positionX][PvZ.plant.get(z).positionY]=0;
        								PvZ.plant.remove(z);
        								PvZ.bullet.remove(z);
        							}
        							c=1;
        						}
        					}
        					for(int z=0;z<PvZ.Peashooter2.size();z++){
        						if(zombie.get(u).x<=PvZ.Peashooter2.get(z).x+75 && zombie.get(u).x>=PvZ.Peashooter2.get(z).x+50 && PvZ.Peashooter2.get(z).y-30==zombie.get(u).y ){
        							zombie.get(u).move=false;
        							PvZ.Peashooter2.get(z).hp-=zombie.get(u).damage;
                            		if(PvZ.Peashooter2.get(z).hp<=0){
                            			PvZ.bg[PvZ.Peashooter2.get(z).positionX][PvZ.Peashooter2.get(z).positionY]=0;		
                            			PvZ.Peashooter2.remove(z);	
                            			PvZ.doublebullet.remove(z);
                            		}	
                            		c=1;
                              }
                          }
                          if(c==0 && zombie.get(u).run){
                              zombie.get(u).move=true;
                          }
                           
                          if(zombie.get(u).x<=310){
                              for(def d: def){
                                  if(d.y==zombie.get(u).y){
                                      d.run=true;
                                  }
                              }
                          }
                          for(def d : def){
                              if(d.run){
                                  if(zombie.get(u).x>=d.x && zombie.get(u).x<d.x+120 && zombie.get(u).run && d.y==zombie.get(u).y ){
                                      zombie.remove(u);
                                      score+=100;
                                  }
                              }
                          }
                          if(zombie.get(u).x<150){
                              PvZ.pause=true;
                              PvZ.lose=true;
                          }
                          
                    }
                   
                    for(Flower f : flow){
                        f.update();
                    }
                    
                    for(int z=0;z<flow.size();z++){
                    	if(flow.get(z).turn>30 && flow.get(z).type==1){
                            flow.remove(z);
                    	}
                    	if(flow.get(z).turn>60 && flow.get(z).type==2){
                            	
                                flow.remove(z);
                    	}
                    }
                    if(zombie.size()<1){	
                    	PvZ.pause=true;
                    	PvZ.win=true;
                    } 
                   
                    t2=System.currentTimeMillis();
                }  
            }
            catch (Exception e) {}
   }         
   repaint();  
  	     }
    }
}

