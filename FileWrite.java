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
                                   // such as: java FileWrite SadBear.java 160
    }

    public static void writeMe(String fileName, String perc) throws IOException
    {  
        File myF = new File(fileName);
        Scanner fr = new Scanner(myF);

        String newFile = fileName.substring(0, fileName.length() - 5) + "x2.java";
        
        FileWriter fw = new FileWriter(newFile);
        PrintWriter outputF = new PrintWriter(fw);
        
        while(fr.hasNext())
        {
            String line = fr.nextLine();
            String sally = "lmq" + line + "lmq";

            if(line.matches("public class(.*)"))
            {
                String keys[] = line.split("\\s+");
                line = line.replace(keys[2], keys[2]+"x2");
            }

            // if 'line' does not include the words: Color, sleep, setLocation, public class
            if(!line.matches("(.*)Color(.*)") && !line.matches("(.*)sleep(.*)") && !line.matches("(.*)setLocation(.*)") && !line.matches("public class(.*)"))
            {
                String nums[] = sally.split("\\D+");
                line = line.replaceAll("\\d+", "##_##ddd##_##");

                for(int i = 0; i < nums.length; i++)
                {
                    if(!nums[i].equals(""))
                    {
                        int doubled = Integer.parseInt(nums[i]) * Integer.parseInt(perc) / 100;
                        String kingDDD = "" + doubled;
                        line = line.replaceFirst("##_##ddd##_##", kingDDD);
                    }
                }
            }
            outputF.println(line); 
        }

        outputF.close();
        fw.close();
        fr.close();
    }
}
