//swing
import javax.swing.*;
class swingEx1 extends JFrame{
    swingEx1(String s1){
        super(s1);
    }
    public static void main(String args[]){
        swingEx1 s1=new swingEx1("welcome to java");
        s1.setVisible(true);
        s1.setSize(500,500);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}