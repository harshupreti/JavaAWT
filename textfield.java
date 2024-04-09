import java.awt.*;

public class textfield extends Frame{
    public textfield() {
        this.setLayout(null);
        TextField t1 = new TextField("Enter username");
        t1.setColumns(30);
        t1.setBounds(150, 100, 200, 20);
        TextField t2 = new TextField("Enter password");
        t2.setColumns(30);
        t2.setBounds(150, 150, 200, 20);
        Label l1 = new Label("Enter username: ");
        l1.setBounds(50, 100, 100, 20);
        Label l2 = new Label("Enter password: ");
        l2.setBounds(50, 150, 100, 20);
        this.add(t1);
        this.add(l1);
        this.add(t2);
        this.add(l2);
        this.setVisible(true);
        this.setSize(500, 500);
    }
    public static void main(String[] args) {
        textfield t1 = new textfield();
    }
}
