import java.util.*;
class Cursors1{
    public static void main(String args[]){
        Vector v1=new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");
        Iterator k1=v1.iterator();
        while(k1.hasNext()){
            System.out.println(k1.next());
        }
    }
}