import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import java.awt.event.MouseAdapter;
import java.awt.Image; 
import java.awt.event.KeyEvent;

// Car sourced from OpenGameArt.org from the creator
// Chasersgaming

public class Sprite {

    public int width; 
    public int height; 
    public int x = (int) (Math.random() * 100); 
    public int y = (int) (Math.random() * 100); 
    public int dx; 
    public int dy; 
    private Image img;
    public boolean outOfBounds = false; 

    public Sprite() { 
        System.out.println(Integer.toString(x));

    }

    //placing sprite image

    protected void spriteAppearance(String imageName) {
        // ImageIcon sprite = new ImageIcon("Images/left_car.png"); 
        ImageIcon sprite = new ImageIcon(imageName); 
        img = sprite.getImage(); 

        width = img.getWidth(null); 
        height = img.getHeight(null); 

    }

    public Image getImage() {
        return img; 
    }

    //sprite position modification
    public void posMod() {
        x += dx;
        y += dy; 
    }

    public void keyPressed(KeyEvent e) {
        int move = e.getKeyCode(); 

        if (move == KeyEvent.VK_LEFT) {
            dx = -20;
        }

        if (move == KeyEvent.VK_RIGHT) {
            System.out.println("Right press");
            dx = 20; 
            System.out.println("X" + " " + Integer.toString(x));
        }

        if (move == KeyEvent.VK_UP) {
            dy = 5; 
        }

        if (move == KeyEvent.VK_DOWN) {
            dy = -5; 
        }

    }

    public void keyReleased(KeyEvent e) {
        int move = e.getKeyCode(); 

        if (move == KeyEvent.VK_LEFT) {
            dx = 0; 
        }

        if (move == KeyEvent.VK_RIGHT) {
            System.out.println("Right released");
            dx = 0; 
        }

        if (move == KeyEvent.VK_UP) {
            dy = 0; 
        }

        if (move == KeyEvent.VK_DOWN) {
            dy = 0; 
        }

    }

    public void keyTyped(KeyEvent e) {

    }

    public boolean boundaryCheck() {
        if (x > 1000) {
            x = 0; 
            outOfBounds = true; 
        }
        else if (x < 0) {
            x = 1000; 
            outOfBounds = true; 
        }
        else if (y > 1000) {
            y = 0; 
            outOfBounds = true; 
        }
        else if (y < 0) {
            y = 1000; 
            outOfBounds = true; 
        }
        else {
            outOfBounds = false; 
        }

        return outOfBounds; 
    }
 
    // public void collisionCheck() {
    //     for 
    // }   

    //on collision of bugs, car crash sound provided
    public void crash() {

    }


    public int xCoord() {
        return x; 
    }

    public int yCoord() {
        return y; 
    }


} 