import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
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

        addKeyListener(new listenHandler()); 
    }

    public void sceneStart() {
        c = new Sprite();
        addKeyListener(new listenHandler()); 
        setBackground(Color.black);
        setFocusable(true); 
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(c.getImage(), c.xCoord(), 
            c.yCoord(), this);
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
    

    @Override 
    public void actionPerformed(ActionEvent e) {
        advance(); 
    }

    private void advance() {
        c.posMod();
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

