//swing-->add JLable
import javax.swing.*;
class Logins extends JFrame{
    void setComponents(){
        JLabel k1=new JLabel("welcome");
        JTextField k2=new JTextField();
        setLayout(null);
        k1.setBounds(100,100,100,50);
        add(k1);
        k2.setBounds(100,50,50,20);
        add(k2);
        
    }
    public static void main(String args[]){
        Logins j1=new Logins();
        j1.setSize(800,800);
        j1.setVisible(true);
        j1.setComponents();
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}