import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouselistener extends Frame implements MouseListener{
    public mouselistener() {
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setBackground(new Color(132,134,125));

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.addMouseListener(this);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        mouselistener m1 = new mouselistener();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at "+e.getX()+","+e.getY());
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at "+e.getX()+","+e.getY());
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at "+e.getX()+","+e.getY());
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered at "+e.getX()+","+e.getY());
    }
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited at "+e.getX()+","+e.getY());
    }
}
