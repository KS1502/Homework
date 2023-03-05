import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        FileInputStream fin = new FileInputStream("ABC.text");
        int i;
        try{
            do{
                i=fin.read();
                if(i!=-1)System.out.println((char) i);
            }while (i!=-1);
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        try{
            fin.close();
        }catch(IOException e){
            System.out.println("Error reading file");
        }



    }
}