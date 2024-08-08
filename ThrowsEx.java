//throws
import java.util.*;
public class ThrowsEx{
    public static void main(String args[]) throws ArithmeticException{
      System.out.println(10/0);
      throw new ArithmeticException();
    }
}