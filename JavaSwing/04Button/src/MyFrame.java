import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Desktop\\JAVA\\JavaSwing\\01Frame\\src\\img1.jpg");

    JButton button;
    JLabel label;

    MyFrame (){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        this.setTitle("Java");
        this.setBackground(new Color(0xCB9BFA));

        button =new JButton();

        button.setBounds(200, 200, 100, 50);
        button.setSize(150, 50);
        button.setIcon(icon);
        button.setText("BUTTON");
        button.setBackground(Color.CYAN);
        button.setFocusable(false);
        button.setFont(new Font("Name", Font.BOLD, 15));
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.orange);
        button.setBorder(BorderFactory.createCompoundBorder());
        button.addActionListener(this);
        button.setVisible(true);

        label = new JLabel();
        label.setBounds(200, 200, 30, 30);
        label.setText("URA");
       // label.setFont(new Font("FontL", Font.HANGING_BASELINE, 30));
        label.setVisible(false);

        this.add(button);
        this.add(label);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Ura");
            button.setVisible(false);
            label.setVisible(true);
        }
    }
}
