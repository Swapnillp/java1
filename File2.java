import java.io.*;
//add data file
public class File2{
    public static void main (String args[]) throws IOException{
        File f1=new File("file.txt");
        FileOutputStream h1=new FileOutputStream(f1);
        h1.write('h');
        h1.close();


    }
}