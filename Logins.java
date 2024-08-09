//swing-->add JLable
import javax.swing.*;
class Logins extends JFrame{
    void setComponents(){
        JLabel k1=new JLabel("welcome");
        setLayout(null);
        k1.setBounds(200,200,100,50);
        add(k1);
        
    }
    public static void main(String args[]){
        Logins j1=new Logins();
        j1.setSize(500,500);
        j1.setVisible(true);
        j1.setComponents();
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}