import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Filepath = "Try";

        createFile(Filepath);

        readFile(Filepath);

    }

    private static void createFile(String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Horses");
            bufferedWriter.newLine();
            bufferedWriter.write("Yes");
            bufferedWriter.newLine();
            bufferedWriter.write("Carlinhos");

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Archive created with success!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String path) {
        try {
            FileReader fileReader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}