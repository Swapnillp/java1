import java.io.*;
//creating file
public class File1{
    public static void main (String args[]) throws IOException{
        File f1=new File("file.txt");
        //Tests whether the file exists
        System.out.println(f1.exists());
        //Tests whether the file is writable or not
        System.out.println(f1.canWrite());
        //Tests whether the file is readable or not
        System.out.println(f1.canRead());
        //Returns the size of the file in bytes
        System.out.println(f1.length());


    }
}