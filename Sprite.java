import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import java.awt.event.MouseAdapter;
import java.awt.Image; 
import java.awt.event.KeyEvent;

// Car sourced from OpenGameArt.org from the creator
// Chasersgaming

public class Sprite {

    private int width; 
    private int height; 
    public int x = (int) (Math.random() * 100); 
    public int y = (int) (Math.random() * 100); 
    private int dx; 
    private int dy; 
    private Image img;

    public Sprite() { 
        // spriteAppearance(imgr); 
        spriteAppearance();
        // this.addKeyListener(this); 
    }

    //placing sprite image

    private void spriteAppearance() {
        ImageIcon sprite = new ImageIcon("Images/left_car.png"); 
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

//     private class moveCar implements KeyListener {
        
//         @Override
//         public void keyPressed(KeyEvent e) {
//             int move = e.getKeyCode(); 

//             if (move == KeyEvent.VK_LEFT) {
//                 // dx = -5; 
//                 x = -5;
//             }

//             if (move == KeyEvent.VK_RIGHT) {
//                 dx = 5; 
//             }

//             if (move == KeyEvent.VK_UP) {
//                 dy = 5; 
//             }

//             if (move == KeyEvent.VK_DOWN) {
//                 dy = -5; 
//             }

//         }

//         @Override
//         public void keyReleased(KeyEvent e) {
//             int move = e.getKeyCode(); 

//             if (move == KeyEvent.VK_LEFT) {
//                 dx = 0; 
//             }

//             if (move == KeyEvent.VK_RIGHT) {
//                 dx = 0; 
//             }

//             if (move == KeyEvent.VK_UP) {
//                 dy = 0; 
//             }

//             if (move == KeyEvent.VK_DOWN) {
//                 dy = 0; 
//             }

//         }

//         @Override
//         public void keyTyped(KeyEvent e) {

//         }
// }
    public void keyPressed(KeyEvent e) {
        int move = e.getKeyCode(); 

        if (move == KeyEvent.VK_LEFT) {
            // dx = -5; 
            x = -5;
        }

        if (move == KeyEvent.VK_RIGHT) {
            System.out.println("Right press");
            x = 20; 
            System.out.println("X" + " " + x.toString());
        }

        if (move == KeyEvent.VK_UP) {
            y = 5; 
        }

        if (move == KeyEvent.VK_DOWN) {
            y = -5; 
        }

    }

    public void keyReleased(KeyEvent e) {
        int move = e.getKeyCode(); 

        if (move == KeyEvent.VK_LEFT) {
            dx = 0; 
        }

        if (move == KeyEvent.VK_RIGHT) {
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


    public void boundaryCheck() {
        // switch 
    }
 
    public void collisionCheck() {
        
    }

    //on collision of bugs, car crash sound provided
    public void crash() {

    }

    public void show() {

    }

    public void hide() {

    }

    public int xCoord() {
        return x; 
    }

    public int yCoord() {
        return y; 
    }


} 