package com.breakoutball;

import com.flappybird.view.Game;
import com.flappybird.view.PlayHub;
import com.flappybird.view.SoundEffects;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener 
{
	private boolean play = false;
        private boolean won = false;
	private int score = 0;
	
	private int totalBricks = 48;
	
	private Timer timer;
	private int delay=8;
	
	private int playerX = 310;
	
	private int ballposX = 120;
	private int ballposY = 350;
	private int ballXdir = -1;
	private int ballYdir = -2;
	
	private MapGenerator map;
	
	public Gameplay()
	{		
		map = new MapGenerator(4, 12);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
                
                timer=new Timer(delay,this);
		timer.start();
	}
	
	public void paint(Graphics g)
	{    		
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		
		// drawing map
		map.draw((Graphics2D) g);
		
		// borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		// the scores 	   
                g.setColor(Color.gray.darker());
		g.setFont(new Font("Impact",Font.BOLD, 28));
		g.drawString("" + score, 591,37);
                
		g.setColor(Color.white);
		g.setFont(new Font("Impact",Font.BOLD, 28));
		g.drawString("" + score, 589,35);
                
		// the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		// the ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);
                
                
	
		if(totalBricks <= 0)
		{
                    play = false;
                    won = true;
                    ballXdir = 0;
                    ballYdir = 0;          
                    
                    g.setColor(Color.RED);
                    
                    int ans = JOptionPane.showConfirmDialog(this, "Do you want to play level 2?", "You Won!",JOptionPane.YES_NO_OPTION);
                    if(ans == JOptionPane.YES_OPTION){
                        play = true;
                        ballposX = 120;
                        ballposY = 350;
                        ballXdir = -1;
                        ballYdir = -2;
                        playerX = 310;
                        totalBricks = 48;
                        this.score = score;

                        map = new MapGenerator(4, 12);
				
                    repaint();
                    }
                    else{
                        System.exit(0);
                    }
//                    g.setFont(new Font("Calibri",Font.BOLD, 30));
//                    g.drawString("You Won!",270,300);
//             
//                    g.setColor(Color.RED);
//                    g.setFont(new Font("Calibri",Font.BOLD, 20));           
//                    g.drawString("Press 'Enter' to start Level 2", 240,350);  
		}
		
		// loosing
		if(ballposY > 570)
                {
                    play = false;
                    ballXdir = 0;
                    ballYdir = 0;
                    int ans = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Game Over!",JOptionPane.YES_NO_OPTION);
                    if(ans == JOptionPane.YES_OPTION){
                        //JOptionPane.showMessageDialog(this, "Press Enter to Restart.");
                        play = true;
                        ballposX = 120;
                        ballposY = 350;
                        ballXdir = -1;
                        ballYdir = -2;
                        playerX = 310;
                        score = 0;
                        totalBricks = 21;

                        map = new MapGenerator(3, 7);

                    repaint();
                    
                    }
                    else{
                        System.exit(0);
                    }
                }
		
            g.dispose();
	}	

	public void keyPressed(KeyEvent e) 
	{
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            {        
		if(playerX >= 600)
		{
                    playerX = 600;
		}
                else
                {
                    moveRight();
                }
            }
		
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
            {     
		if(playerX < 10)
		{
                    playerX = 10;
		}
		else
		{
                    moveLeft();
		}
            }	
            
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {          
		if(!play)
		{
                    play = true;
                    ballposX = 120;
                    ballposY = 350;
                    ballXdir = -1;
                    ballYdir = -2;
                    playerX = 310;
                    score = 0;
                    totalBricks = 21;
                    
                    map = new MapGenerator(3, 7);
				
                    repaint();
		}
                
                if(won){
                    play = true;
                    ballposX = 120;
                    ballposY = 350;
                    ballXdir = -1;
                    ballYdir = -2;
                    playerX = 310;
                    totalBricks = 48;
                    this.score = score;
                    
                    map = new MapGenerator(4, 12);
				
                    repaint();
                }
            }		
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
	public void moveRight()
	{
		play = true;
		playerX += 20;	
	}
	
	public void moveLeft()
	{
		play = true;
		playerX -= 20;	 	
	}
	
	public void actionPerformed(ActionEvent e) 
	{
            timer.start();
            if(play)
            {			
                if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 30, 8)))
                {
                    ballYdir = -ballYdir;
                    ballXdir = -2;
		}
		else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX + 70, 550, 30, 8)))
		{
                    ballYdir = -ballYdir;
                    ballXdir = ballXdir + 1;
		}
		else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX + 30, 550, 40, 8)))
		{
                    ballYdir = -ballYdir;
		}
			
			// check map collision with the ball		
		A: for(int i = 0; i<map.map.length; i++)
		{
                    for(int j =0; j<map.map[0].length; j++)
                    {				
                        if(map.map[i][j] > 0)
		        {
                            //scores++;
                            int brickX = j * map.brickWidth + 80;
                            int brickY = i * map.brickHeight + 50;
                            int brickWidth = map.brickWidth;
                            int brickHeight = map.brickHeight;
						
                            Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);					
                            Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                            Rectangle brickRect = rect;
						
                            if(ballRect.intersects(brickRect))
                            {					
				map.setBrickValue(0, i, j);
                                SoundEffects.playMusic();
				score+=5;	
				totalBricks--;
                                                        
                                // when ball hit right or left of brick
				if(ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width)	
				{
                                    ballXdir = -ballXdir;
				}
                                
				// when ball hits top or bottom of brick
				else
				{
                                    ballYdir = -ballYdir;				
				}
							
                                break A;
			    }
			}
                    }
                }
			
		ballposX += ballXdir;
		ballposY += ballYdir;
			
		if(ballposX < 0)
		{
                    ballXdir = -ballXdir;
		}
                
		if(ballposY < 0)
		{
                    ballYdir = -ballYdir;
                }
			
                if(ballposX > 670)
		{
                    ballXdir = -ballXdir;
		}		
			
		repaint();		
	    }
       }
}
