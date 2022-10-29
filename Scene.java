import java.awt.*; 
import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*; 
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter; 


public class Scene extends JPanel implements ActionListener {

    public Sprite c; 

    public Scene() {
        
        sceneStart(); 

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX(); 
                int mouseY = e.getY(); 
        
                System.out.println(mouseX + " " + mouseY);
            }
        }); 
    }

    private void sceneStart() {
    
        this.addKeyListener(new listenHandler()); 

        c = new Sprite();

        setBackground(Color.black);
        setFocusable(true); 
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        createElement(g);
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void createElement(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(c.getImage(), c.xCoord(), 
            c.yCoord(), this);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        System.out.println("This is x" + c.x); 
        advance();
      
    }

    private void advance() {
        c.posMod();
        
        repaint(c.xCoord()-1, c.yCoord()-1, 
        c.width, c.height); 
        
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
    



 //   public void paint(Graphics g) {
//
  //      super.paintComponent(g); 
    //    doDrawing(g);

  //      Graphics2D g2D = (Graphics2D) g; 
//
    //    g2D.drawImage(c.getImage(), c.xCoord(), c.yCoord(), this); 

        
    //}

    static void begin() {
        // on mouse down move object
    }
    
    static void end() {
        System.out.println("End"); 
    }

    static void pause() {
        System.out.println("Pause"); 
    }

    public void remove() {
        // frame.getContentPane().removeAll(); 
    }


}

