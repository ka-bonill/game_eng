import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 


public class Scene extends JFrame {
    public Scene(int x, int y) {
        System.out.println(Integer.toString(x) + " " + Integer.toString(y)); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(x, y); 
        this.setLocationRelativeTo(null); 
        this.setVisible(true); 

        setLayout(new BorderLayout());

        this.setBackground(Color.BLUE);
    

    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g; 

        g2D.drawLine(0, 0, 1000, 1000); 
    }

    static void begin() {
        // on mouse down move object
    }
    
    static void end() {
        System.out.println("End"); 
    }

    static void pause() {
        System.out.println("Pause"); 
    }

    static void remove() {
        System.out.println("Remove"); 
    }
}

