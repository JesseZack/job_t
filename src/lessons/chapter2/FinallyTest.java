package lessons.chapter2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
    public static void main(String[] args) throws  Exception {
        try {
            FileInputStream fis = new FileInputStream("/home/ldr21/IdeaProjects/job_t/src/lessons/chapter2/aFile.txt");

            try {
                fis.read();
                System.out.println("Reading...");
            } finally {
                fis.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("File was not found");
            
        }finally {
            System.out.println("Exiting....");
        }

    }
}
