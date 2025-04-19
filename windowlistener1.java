import java.awt.*;

public class windowlistener1 extends Frame{
    public windowlistener1() {
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500, 500);

        this.setBackground(new Color(255,0,0));

        this.addWindowListener(new windowlistener());
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        windowlistener1 w1 = new windowlistener1();
    }
}
