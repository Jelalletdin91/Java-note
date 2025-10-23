import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("img1.jpg");

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("Panel");

        JLabel label=new JLabel();
        label.setIcon(image);

        label.setBounds(100, 25, 100, 100);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.yellow);
        label.setOpaque(true);


        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 150, 150);
        redpanel.setLayout(null);


        JPanel panel2=new JPanel();
        panel2.setBackground(new Color(25, 255, 45));
        panel2.setBounds(150, 0, 150, 150);
        panel2.setLayout(null);

        JPanel panel3 =new JPanel();
        panel3.setBackground(new Color(180, 60, 255));
        panel3.setBounds(0, 150, 300, 150);
        panel3.setLayout(null);



        panel3.add(label);
        frame.add(redpanel);
        frame.add(panel2);
        frame.add(panel3);


    }
}