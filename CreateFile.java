import java.io.*;
//creating file
public class CreateFile{
    public static void main (String args[]) throws IOException{
        File f1=new File("file.txt");
        f1.createNewFile();
    }
}