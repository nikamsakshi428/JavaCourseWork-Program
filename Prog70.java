import java.io.*;

public class Prog70 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello Sahil!");
            fw.close();
            System.out.println("Data written to file.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}