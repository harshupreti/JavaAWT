import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class keylistener extends Frame implements KeyListener{
    public keylistener() {
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500, 500);

        this.setBackground(new Color(0,123,123));
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at ["+e.getX()+","+e.getY()+"]");
            }
        });

        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key typed: "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed: "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key released: "+e.getKeyChar());
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        keylistener k1 = new keylistener();
    }
}
