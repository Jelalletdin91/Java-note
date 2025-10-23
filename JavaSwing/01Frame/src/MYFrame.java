import javax.swing.*;
import java.awt.*;

public class MYFrame extends JFrame {

    MYFrame (){
        this.setTitle("TITLE");
        this.setVisible(true);//Doing the frame visible
        int x =400;
        int y=400;
        this.setSize(x, y);//Give a size for frame
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Now we can exit when we will click to x
        this.setResizable(true);//If the paramether is true then we can change size unless (false) we cannot change the size


        ImageIcon jiji=new ImageIcon("img1.jpg");
        this.setIconImage(jiji.getImage());//Putting new icon
        // frame.getContentPane().setBackground(Color.red);
        this.getContentPane().setBackground(new Color(255, 0, 150));//Changing background color
    }
}
