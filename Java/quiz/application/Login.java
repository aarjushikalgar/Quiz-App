package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton rules;
    JButton back;
    JTextField tfname;
    String username;
    Login(){
        getContentPane().setBackground(Color.white);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/quiz.png"));
        JLabel image = new JLabel(i1);
        add(image);
        setLayout(null);


        image.setBounds(4,4,300,250);
        JLabel heading = new JLabel(" All The Best..!");
        heading.setBounds(450, 300,100,250);
        add(heading);
        heading.setForeground(Color.blue);
        heading.setFont(new Font("Arial Black", Font.BOLD,10));

        JLabel name = new JLabel(" Enter Your User Id");
        name.setBounds(450, 10,500,200);
        add(name);
        name.setForeground(Color.black);
        name.setFont(new Font("Arial Black", Font.BOLD,13));

        tfname = new JTextField();
        tfname.setBounds(400,170, 300,30);
        add(tfname);

         rules=new JButton("Login");
        rules.setBounds(350,250,95,30);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(650,250,95,30);
        back.addActionListener(this);
        add(back);

        setVisible(true);
        setLocation(300, 100);
        setSize(800,550);


    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);

            new Quiz(name);
            
        } else if (ae.getSource()==back) {
            setVisible(false);

            
        }
    }
    public static void main(String[] args) {
        new Login();

    }
}
