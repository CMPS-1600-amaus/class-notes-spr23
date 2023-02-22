
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ExceptionSandbox {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<Integer>();
        //System.out.println(calcAverage(list));

        /*BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader("myFile.txt"));
            // some other line
            // another one
        } catch(IOException e) {
            // possibly print error message that file not found.
            e.printStackTrace(); // print list of methods leading to issue.
            System.out.println(e.getMessage()); // print out this exceptions message.
        }*/
    }

    public static double calcAverage(ArrayList<Integer> list){
        int ave = 0;
        for(Integer val : list){
            ave += val;
        }
        return ave / list.size();
    }

    public static ArrayList<String> readInFile(String filename){

        BufferedReader input = null;
        ArrayList<String> lines = new ArrayList<String>();

        try {
            input = new BufferedReader(new FileReader(filename));
            // read in all lines
            throw new IOException();
        } catch (IOException e) {
            // handle the exception
        } finally {
            try {
                input.close();
            } catch (IOException e){

            }
        }

        return lines;
        
    }
}
