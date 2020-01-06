// imports
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite
{
    public static void main(String[] args) throws IOException
    {
        writeMe(args[0], args[1]); // take file name & scaling percentage as command line argument
                                   // such as: java FileWrite SadBear 160
    }

    public static void writeMe(String fileName, double perc) throws IOException
    {
        double factor = perc/10;
            
        File myF = new File(fileName);
        Scanner fr = new Scanner(myF);

        String newFile = fileName.substring(0, fileName.length() - 5) + "x2.java";
        
        FileWriter fw = new FileWriter(newFile);
        PrintWriter outputF = new PrintWriter(fw);

        // words to avoid in program
        // setColor()
        // sleep()
        // anything with text right before it (with no spaces), such as "ray", "blk", "drop"
        
        // words indicating a scalar needed
        // fillOval(), addPoint(), fillRect(), setSize(), setLocation()?
        
        while(fr.hasNext())
        {
            String line = fr.nextLine();
            // if 'line' includes the words: fillOval(), addPoint(), fillRect(), setSize()
            outputF.println(line); // modified line outputted into the new file 
        }

        output.close();
        fw.close();
        fr.close();
    }
}
