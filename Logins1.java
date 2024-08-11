//Login form
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

    class Logins1 extends JFrame{
        JLabel l1,l2,l3,l4;
        JTextField t1;
        JPasswordField t2;
        JButton b1,b2;

        Logins1(String s1){
            super(s1);
        }
        Logins1(){

        }
        void setComponents(){
            Font f1=new Font("Times New Romen",Font.BOLD,20);
            l1=new JLabel("Welcome to Login screen...");
            l1.setFont(f1);
            l1.setForeground(Color.DARK_GRAY);
            l2=new JLabel("USERNAME");
            l3=new JLabel("PASSWORD");
            l4=new JLabel();
            t1=new JTextField();
            t2=new JPasswordField();
            b1=new JButton("Login");
            b2=new JButton("Clear");
            b1.setBackground(Color.BLUE);
            b2.setBackground(Color.red);
            setLayout(null);
            setVisible(true);
            setSize(700,700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(l1);
            add(l2);
            add(l3);
            add(l4);
            add(t1);
            add(t2);
            add(b1);
            add(b2);
            b1.addActionListener(new log());
            b2.addActionListener(new Clear());
            l1.setBounds(100,50,300,30);
            l2.setBounds(100,200,100,30);
            l3.setBounds(100,350,100,30);
            l4.setBounds(100,550,200,30);
            t1.setBounds(350,200,100,30);
            t2.setBounds(350,350,100,30);
            b1.setBounds(200,450,100,30);
            b2.setBounds(400,450,100,30); 

        } 
        public static void main(String args[]){
            Logins1 s1=new Logins1("Login");
            s1.setVisible(true);
            s1.setSize(700,700);
            s1.setComponents();
            s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } 
        class log implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2 = new String(t2.getPassword());
                if(s1.equals("admin")&&s2.equals("admin")){
                    l4.setText("Login succesful :");
                }else{
                    l4.setText("Login unsuccesful :");
                }
            }      
       
        }
        class Clear implements ActionListener{
            public void  actionPerformed(ActionEvent e1){
                t1.setText(null);
                t2.setText(null);
            }
        }
    
    }
    
