import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SearchString {

    public static void main(String args[]){
        String pattern;
        String file;
        // Checks to see if correct amount of arguments
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
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + file);
            }
        }else{
            System.out.println("Usage: java StringSearch [-i] <pattern> <file>");
        }
    }
}