package designpatternsA1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter File Address: ");
        String fileAddress = scanner.next();
        System.out.println("Enter the key you want to removed from the file: ");
        String key = scanner.next();
        removeStringFromFile(key, "src/"+ fileAddress);
    }

    public static void removeStringFromFile(String key, String fileAddress){
        try{
            FileReader fileReader = new FileReader(fileAddress);
            int ascii = fileReader.read();
            String content = "";

            while (ascii != -1)
            {
                content += (char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            String replaced = content.replaceAll("this", "");
            File file = new File(fileAddress);
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(replaced);
                fileWriter.close();
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
