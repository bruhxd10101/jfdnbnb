/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootyourshot;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 800543
 */
public class World extends JPanel{
    private Timer timer;
    private Person player;
    public World() {
        super();
        timer = new Timer();
        player = new Person(800,600);
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
    }
    
      @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.gray);
        player.draw(g);
    }

    
        private class ScheduleTask extends TimerTask {

        @Override
        public void run() {         
            repaint();
        }
    }
}
