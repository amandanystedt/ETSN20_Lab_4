import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SearchString {

    public static void main(String args[]){
        String pattern;
        String file;
        if(args.length == 2){ 
            pattern = args[0];
            file = args[1];
            try {
                Scanner scan = new Scanner(new File(file));
                while (scan.hasNextLine()) {
                    String nextLine = scan.nextLine();
                    if (nextLine.contains(pattern)) {
                        System.out.println(nextLine);
                    }
                }
                scan.close(); // Close the scanner to release resources
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + file);
            }
        }else{
            System.out.println("Wrong number of inputs");
        }
    }
}