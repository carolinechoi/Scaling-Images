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
        writeMe(args[0]); // take file name as command line argument
    }

    public static void writeMe(String fileName) throws IOException
    {
        File myF = new File(fileName);
        Scanner fr = new Scanner(myF);

        String newFile = fileName.substring(0, fileName.length() - 4) + "x2.txt";
        
        FileWriter fw = new FileWriter(newFile);
        PrintWriter output = new PrintWriter(fw);

        while(fr.hasNext())
        {
            String line = fr.nextLine();
            output.println(line);
        }

        output.close();
        fw.close();
        fr.close();
    }
}
