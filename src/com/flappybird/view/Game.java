package com.flappybird.view;

import com.flappybird.controller.Controller;
import com.flappybird.model.Bird;
import com.flappybird.model.Tube;
import com.flappybird.model.TubeColumn;
import com.flappybird.model.proxy.ProxyImage;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author vanshaj
 */
public class Game extends JPanel implements ActionListener {

    private boolean isRunning = false;
    private ProxyImage proxyImage;
    private Image background;
    private Bird bird;
    private TubeColumn tubeColumn;
    private int score;
    private int highScore;
    public boolean gameOver = false;
   
    
    public Game() {
        proxyImage = new ProxyImage("/assets/background.png");
        background = proxyImage.loadImage().getImage(); 
        setFocusable(true);
        setDoubleBuffered(false);
        addKeyListener(new GameKeyAdapter());
        Timer timer = new Timer(15, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().sync();
        if (isRunning) {
            bird.tick();
            tubeColumn.tick();
            checkColision();
            score++; 
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(background, 0, 0, null);
        if (isRunning) {
            this.bird.render(g2, this);
            this.tubeColumn.render(g2, this);
            g2.setColor(Color.white);
            g.setFont(new Font("Impact",Font.BOLD, 40));
            g2.drawString("" + this.tubeColumn.getPoints(),Window.WIDTH / 2  , 45);
            g2.setColor(Color.decode("#424001"));
            g.setFont(new Font("Impact",Font.BOLD, 40));
            g2.drawString("" + this.tubeColumn.getPoints(),Window.WIDTH / 2 - 2 , 43);   
            
           g.setColor(Color.green.darker());
            g.fillRect(0,Window.HEIGHT-40, Window.WIDTH, 10); 
        } 
        else if(gameOver == true){
            Graphics2D g3 = (Graphics2D) g;
            g3.setColor(Color.darkGray);
            g3.setFont(new Font("Georgia", 1, 50));
            g3.drawString("Game Over!", Window.WIDTH / 2 - 150, Window.HEIGHT / 2);
            Graphics2D g4 = (Graphics2D) g;
            g4.setColor(Color.decode("#260000"));
            g4.setFont(new Font("Arial", 1, 18));
            g4.drawString("(Press Enter to Start)", Window.WIDTH / 2 - 90, Window.HEIGHT / 2 + 35);
            g2.setColor(Color.black);
            g.setFont(new Font("Calibri", 1, 20));
            g2.drawString("Your Score: " + this.tubeColumn.getPoints() , 10, 20);
            g2.setColor(Color.black);
            g.setFont(new Font("Calibri", 1, 20));
            g2.drawString("High Score: " + highScore, Window.WIDTH - 135, 20);
        }
        else{
            g2.setColor(Color.black);
            g.setFont(new Font("Verdana", 1, 20));
            g2.drawString("Press Enter to Start the Game", Window.WIDTH / 2 - 170, Window.HEIGHT / 2);
//            g2.setColor(Color.black);
//            g.setFont(new Font("Consolas", 1, 15));
//            g2.drawString("Developed by Vanshaj Pahwa", Window.WIDTH - 220, Window.HEIGHT - 50);
            g2.setColor(Color.black);
            g.setFont(new Font("Calibri", 1, 20));
            g2.drawString("High Score: " + highScore, Window.WIDTH - 130, 20);
        }

        g.dispose();
    }

    public void restartGame() {
        if (!isRunning) {
            this.isRunning = true;
            this.bird = new Bird(Window.WIDTH / 2, Window.HEIGHT / 2);
            this.tubeColumn = new TubeColumn();
            this.tubeColumn.setPoints(0);
        }
    }

    public void endGame() {
        this.isRunning = false;
        if (this.tubeColumn.getPoints() > highScore) {
            this.highScore = this.tubeColumn.getPoints();
        }
        this.highScore = highScore;
    }
    
    public void checkColision() {
        Rectangle rectBird = this.bird.getBounds();
        Rectangle rectTube;

        for (int i = 0; i < this.tubeColumn.getTubes().size(); i++) {
            Tube tempTube = this.tubeColumn.getTubes().get(i);
            rectTube = tempTube.getBounds();
            if (rectBird.intersects(rectTube) || rectBird.y == 550 || rectBird.y == 0) {
                gameOver = true;
                endGame();
            }
        }
    }


    // Key
    private class GameKeyAdapter extends KeyAdapter {

        private final Controller controller;

        public GameKeyAdapter() {
            controller = new Controller();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                restartGame();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (isRunning) {
                controller.controllerReleased(bird, e);
            }
        }
    }
}
