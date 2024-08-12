import java.io.*;
//add data file
public class File3{
    public static void main (String args[]) throws IOException{
        File f1=new File("file1.txt");
        //appending char
        FileOutputStream h1=new FileOutputStream(f1,true);
        h1.write('k');
        h1.close();


    }
}