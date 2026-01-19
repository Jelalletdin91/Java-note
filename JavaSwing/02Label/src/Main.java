import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ImageIcon image =new ImageIcon("C:\\Users\\Admin\\Desktop\\JAVA\\JavaSwing\\01Frame\\src\\img1.jpg");
        Border border= BorderFactory.createLineBorder(Color.blue);

        JFrame frame=new JFrame();
        JLabel label=new JLabel("The Label");

        frame.setSize(400, 400); 
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        //frame.setLayout(null);

        //label.setText("The Label");//Text of a Label
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.TOP);//set Text  Label RIGHT, BOTTOM, LEFT, TOP of image.
        label.setHorizontalTextPosition(JLabel.LEFT);//set Text  Label RIGHT, BOTTOM, LEFT, TOP of image.
        label.setForeground(new Color(255, 125, 15));//sets a color to label
        label.setFont(new Font("MV Boli", Font.ITALIC, 25));//Font of label
        label.setSize(300, 350);//setting Size to Label
        label.setIconTextGap(50);//Gap between text and image
        label.setBackground(Color.BLACK);
        label.setOpaque(true);//Doing visible background color of label
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);//
        label.setBounds(150, 150,  300, 350);
        label.setLayout(null);



        frame.add(label);//adding label to frame
        frame.pack();
    }
}