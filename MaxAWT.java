import java.awt.*;
import java.awt.event.*;

public class MaxAWT extends Frame implements ActionListener {

    TextField t1, t2, t3, result;
    Button b;

    MaxAWT() {
        setLayout(new FlowLayout());

        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(5);
        result = new TextField(10);

        b = new Button("Find Max");
        b.addActionListener(this);

        add(new Label("Enter Num1"));
        add(t1);
        add(new Label("Enter Num2"));
        add(t2);
        add(new Label("Enter Num3"));
        add(t3);
        add(b);
        add(result);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int max = Math.max(a, Math.max(b, c));
        result.setText("Maximum is: " + max);
    }

    public static void main(String[] args) {
        new MaxAWT();
    }
}