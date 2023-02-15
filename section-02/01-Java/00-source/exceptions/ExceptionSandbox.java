
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExceptionSandbox {
    public static void main(String[] args) {
        /*try {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(5);
            System.out.println(calcAverage(list));
        } catch(ArithmeticException e) {
            System.out.println("List empty");
        }*/

        BufferedReader input = openFile("myFile.txt");
    }

    public static double calcAverage(ArrayList<Integer> list){
        int ave = 0;
        for(Integer val : list){
            ave += val;
        }
        return ave / list.size();
    }

    public static void readFromUserFile(){
        // get filename from user
        String filename = "";
        BufferedReader input = openFile(filename);
        // This would be an appropriate place to handle IOExceptions
        // from opening the file. Here, we can ask the user for
        // another file name.
    }

    public static BufferedReader openFile(String filename) {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(filename));
            // some other line
            // another one
        } catch(FileNotFoundException e) {
            // possibly print error message that file not found.
            e.printStackTrace(); // print list of methods leading to issue.
            System.out.println(e.getMessage()); // print out this exceptions message.
        }
        return input;
    }

    public static ArrayList<String> readInFile(String filename) {
        // This is horrible. If exceptions can be thrown while reading in
        // the file, the input.close() must occur in a finally block.
        // close() throws an exception which must be handled. Argh!!
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(filename));
            throw new IOException();
            //input.close()
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            // no matter what happens, code here will run
            try {
                input.close();
            } catch(IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Finished with fileIO");
        return new ArrayList<String>();
    }
}
