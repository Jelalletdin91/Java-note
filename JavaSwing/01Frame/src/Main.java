import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       /* JFrame frame=new JFrame();//Creates frame
        frame.setTitle("TITLE");
        frame.setVisible(true);//Doing the frame visible
        int x =400;
        int y=400;
        frame.setSize(x, y);//Give a size for frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Now we can exit when we will click to x
        frame.setResizable(true);//If the paramether is true then we can change size unless (false) we cannot change the size


        ImageIcon jiji=new ImageIcon("img1.jpg");
        frame.setIconImage(jiji.getImage());//Putting new icon
       // frame.getContentPane().setBackground(Color.red);
        frame.getContentPane().setBackground(new Color(255, 0, 150));//Changing background color */
        MYFrame frmae=new MYFrame();


    }
}