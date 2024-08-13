import java.util.*;
class Cursor3{
    public static void main(String args[]){
        Vector v1=new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");
        //listiterator having to function hasNext() and hasPrevious
        ListIterator k1=v1.listIterator();
        while(k1.hasNext()){
            System.out.println(k1.next());
        }
        //hasPrevious
        while(k1.hasPrevious()){
            System.out.println(k1.previous());
        }
    }
}