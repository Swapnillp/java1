//voter is valid or not.
//pass a custom error or business error age can't negative/zero.
import java.util.Scanner;
 class Voter{
        void valid(int age){
        if(age>17){
            System.out.println("voter is valid");
        }else if(age>0&&age<=17){
            System.out.println("voter is not valid");
        }else{
            throw new ArithmeticException("age can't negative/zero");
        }
    } 
}
public class ThrowEx{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age:");
        int a=sc.nextInt();
        Voter v=new Voter();
        v.valid(a);

    }
}