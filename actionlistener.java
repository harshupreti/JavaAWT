import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class actionlistener extends Frame implements ActionListener{
    
    Label lb;
    Button b1;
    public actionlistener() {
        this.setVisible(true);
        this.setSize(500,500);
        this.setBackground(new Color(0x009270));

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b1 = new Button("Button 1");

        this.add(b1);
        lb = new Label();
        lb.setBounds(100, 100, 100, 30);
        this.add(lb);

        this.setLayout(new FlowLayout());
        b1.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lb.setText("Hello");
    }

    public static void main(String[] args) {
        actionlistener a1 = new actionlistener();
    }
}
