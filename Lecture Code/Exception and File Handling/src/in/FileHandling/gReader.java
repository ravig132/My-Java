package in.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class gReader {
    public static void main(String[] args) {
        String fileName = "java.txt";
        try(FileReader reader = new FileReader(fileName)){
            int read = 0 ;
            do {
                read = reader.read() ;
                System.out.print((char) read);
            }while (read != -1) ;
        }catch (IOException exception){
            System.out.printf("Exception Occurred ,%s ",exception.getMessage());
        }
    }
}
