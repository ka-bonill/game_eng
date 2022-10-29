import java.awt.*; 
import javax.swing.*; 
import java.awt.EventQueue; 
import javax.swing.JFrame;

public class Main extends JFrame{

    public Main() {
        System.out.println("Main"); 
        gameStart(); 
    }

    public void gameStart() {
        add(new Scene()); 

        setSize(1000,1000); 
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Main first = new Main();
            first.setVisible(true);
        });
    }
}
