import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;


/**
 * Reads in some integers from a data file whose name is provided on the command line, 
 * sorts the list and prints values in sorted order
 */
public class NotHeapSort {

    /**
     * @param args array of Integers to sort with a heap
     */
    public static void main(String[] args){
        
        //read integers from a file into the input list
        LinkedList<Integer> input = new LinkedList<Integer>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line = br.readLine();
            while (line != null) {
                input.add(Integer.parseInt(line));
                line = br.readLine();
            }
            br.close();
        }
        catch(IOException e){
            System.err.println("Invalid Filename!");
            System.exit(1);
        }
        
        //sort the list
        Collections.sort(input);
        
        //print the list
        for(Integer i : input) {
            System.out.println(i);
        }
    }

}