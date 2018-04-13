package problem4;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** command line program takes name of a text file as
 *  argument, reads the file one line at a time, and prints the current line number and the
 *  current line to the terminal */

public class Main {


    public static void main(String[] args) {

        String filePath = "out/production/Exercise7/problem4/test.txt";
        printLines(filePath);

    }


    private static void printLines(String fileName){

        Path path = Paths.get(fileName);

        if(!Files.exists(path)){
            System.out.println("The files does not exist!");
            return;
        }
        if (!Files.isRegularFile(path)) {
            System.out.println("The file is not a regular file.");
            return;
        }
        if (!Files.isReadable(path)) {
            System.out.println("The file is not readable.");
            return;
        }

        //Check for file has been done

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(counter + " " + line);
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }


    }
}
