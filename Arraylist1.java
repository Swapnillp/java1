//Arraylist
import java.util.*;
class Arraylist1{
    public static void main(String args[]){
        ArrayList a1=new ArrayList();
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        System.out.println(a1);
         // Get the iterator
         Iterator<String> it = a1.iterator();
        // Print the first item
        System.out.println("Print first item:"+it.next());
        //print complete loop
        Iterator<String> it1 = a1.iterator();
    while(it1.hasNext()) {
        System.out.println(it1.next());
      }
    }
}