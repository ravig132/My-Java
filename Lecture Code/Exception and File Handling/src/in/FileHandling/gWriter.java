package in.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class gWriter {
    public static  void main (String [] args){
        String fileName = "java.txt";
        try (FileWriter writer= new FileWriter(fileName)){
            writer.write("This is the best java course.\n");
            for (int i = 0; i < 100; i++) {
                writer.write("@");
            }
            writer.flush();
            System.out.println("File Written Successfully");
        }catch (IOException exception){
            System.out.printf("Exception Occurred, %s ",exception.getMessage());
        }
    }
}
