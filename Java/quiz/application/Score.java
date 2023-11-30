package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name,int score){

        setBounds(180,0,1000,600);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/tropy.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,10,500,200);
        add(image);

        JLabel heading= new JLabel("Congratulations "+ name +"..!");
        heading.setBounds(350,250,300,40);
        heading.setFont(new Font("Arial Black",Font.BOLD,15));
        add(heading);

        JLabel lblscore= new JLabel("Your Score : "+score);
        lblscore.setBounds(430,300,300,40);
        lblscore.setFont(new Font("Arial Black",Font.BOLD,15));
        add(lblscore);

        JButton submit =new JButton("Try Again");
        submit.setBounds(420,370,120,30);
        add(submit);



        submit.addActionListener(this);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){


        setVisible(false);
        new Login();

    }



    public static void main(String[] args) {
        new Score("user",0);
    }

}
