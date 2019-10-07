/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootyourshot;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;



/**
 *
 * @author 800543
 */
public class Person {
     private int height, width, x, y;
     private Rectangle bounds;
    private Image img;
    private ImageIcon ii;
        
        public Person (int cWidth, int cHeight) {    
        this.x = cWidth / 2;
        this.y = cHeight / 2;
        this.width = 50;
        this.height = 50;
        this.ii = new ImageIcon(getClass().getResource("Man-Download-PNG.png"));
        this.img = ii.getImage();
        }

       public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.fill(bounds);
    }
      
}
