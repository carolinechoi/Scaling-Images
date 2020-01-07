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

    public static void writeMe(String fileName, String perc) throws IOException
    {
        int factor = Integer.parseInt(perc)/10; // need to turn this into a double

        System.out.println(factor);
            
        File myF = new File(fileName);
        Scanner fr = new Scanner(myF);

        String newFile = fileName.substring(0, fileName.length() - 4) + "x2.txt";
        
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
            // check page 17-2 of the BPJ textbook
            String line = fr.nextLine();

            // if 'line' includes the words: fillOval(), addPoint(), fillRect(), setSize()
            String sally = "lmq" + line + "lmq";
            String nums[] = sally.split("\\D+");
            
            line = line.replaceAll("\\d+", "##_##ddd##_##");

            for(int i = 0; i < nums.length; i++)
            {
                if(!nums[i].equals(""))
                {
                    int doubled = Integer.parseInt(nums[i]) * factor;
                    String kingDDD = "" + doubled;
                    line = line.replaceFirst("##_##ddd##_##", kingDDD);
                }
            }
            outputF.println(line); // modified line outputted into the new file 
        }

        outputF.close();
        fw.close();
        fr.close();
    }
}
