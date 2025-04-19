import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class borderlayout extends Frame{
    public borderlayout() {
        this.setVisible(true);
        this.setTitle("Border Layout");
        this.setSize(500,500);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        this.add(b1,BorderLayout.NORTH);
        this.add(b2,BorderLayout.SOUTH);
        this.add(b3,BorderLayout.EAST);
        this.add(b4,BorderLayout.WEST);
        this.add(b5,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        borderlayout b1 = new borderlayout();
    }
}
