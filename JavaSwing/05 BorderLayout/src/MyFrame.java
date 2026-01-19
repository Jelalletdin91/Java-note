import javax.swing.*;
import java.awt.*;

public class MyFrame  extends JFrame {
    ImageIcon icon=new ImageIcon("C:\\Users\\Admin\\Desktop\\JAVA\\JavaSwing\\01Frame\\src\\img1.jpg");

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;

    JLabel label;

    MyFrame (){
        this.setTitle("Border Layout");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(600, 600);
        this.setLayout(new BorderLayout(10, 10));

        label=new JLabel();
        label.setVisible(true);
        label.setIcon(icon);
        label.setSize(100, 100);
        label.setOpaque(true);
        label.setBackground(Color.ORANGE);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);


        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        panel6=new JPanel();

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));
        panel6.setPreferredSize(new Dimension(50, 50));

        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.ORANGE);
        panel5.setBackground(Color.RED);

        panel6.setLayout(new BorderLayout(5, 5));
        panel6.add(label);

        panel5.setLayout(new BorderLayout(50, 50));
        panel5.add(panel6, BorderLayout.CENTER);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2,  BorderLayout.EAST);
        this.add(panel3, BorderLayout.WEST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);


    }
}
