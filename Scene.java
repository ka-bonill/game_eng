import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Scene extends JPanel implements ActionListener {

    public Sprite c; 
    public Sprite c2; 
    private final int pause = 10;
    private Timer clock; 

    public Scene() {
        
        sceneStart(); 
    }

    private void sceneStart() {
    
        this.addKeyListener(new listenHandler()); 

        c = new Sprite();
        c.spriteAppearance("Images/left_car.png");

        c2 = new Sprite(); 
        c2.spriteAppearance("Images/right_car.png"); 

        clock = new Timer(pause, this);
        clock.start();

        setBackground(Color.black);
        setFocusable(true); 
        
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        createElement(g);

        g.dispose();
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void createElement(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(c.getImage(), c.xCoord(), 
            c.yCoord(), this);

        g2d.drawImage(c2.getImage(), c2.xCoord(), 
            c2.yCoord(), this);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        System.out.println("This is x" + c.x); 
        advance();
      
    }

    private void advance() {
        c.posMod();

        c.boundaryCheck();

        if (c.boundaryCheck() == true) {
            
            setBackground(Color.black);  
        } 
        
        repaint(c.xCoord(), c.yCoord(), 
        c.width, c.height); 
        
    }

    public void collisionCheck() {
        if ((c.x == c2.x) || (c.y == c2.y)) {
            c2.setVisible(false); 
        }
        else {
            continue; 
        }
    }   

    private class listenHandler extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            c.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            c.keyPressed(e);
        }
    }


}

