package exercise2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Fileout1 {
    public static void main(String[] args) {
        try {
            File file = new File("File.txt");
            Scanner num = new Scanner(System.in);
            System.out.println("请输入要录入的内容：");
            String b = num.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(b);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}