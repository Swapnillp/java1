import java.io.*;
//add data file
public class File4{
    public static void main (String args[]) throws IOException{
        File f1=new File("file2.txt");
        String s1="Swapnil Patil";
        //appending char
        FileOutputStream h1=new FileOutputStream(f1,true);
        char[] c1=s1.toCharArray();
        for(int i=0;i<c1.length;i++){
            h1.write(c1[i]);
        }
        //getBytes() method to convert the string to a byte array and writes it directly to the file.
       // h1.write(s1.getBytes());
        h1.close();


    }
}