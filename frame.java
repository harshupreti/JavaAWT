import java.awt.*;

public class frame extends Frame {
    public frame() {
        this.setLayout(null);
        Label l = new Label("Harsh");
        l.setBounds(50, 100, 100, 30);
        this.add(l);
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("Harsh ");
    }
    public static void main(String[] args) {
        frame fm = new frame();
    }
}

// public class frame {
    
//     public frame() {
//         Frame fm = new Frame("Harsh");
//         fm.setVisible(true);
//         fm.setSize(500,500);
//     }
//     public static void main(String[] args) {
//         frame fm = new frame();
//     }
// }