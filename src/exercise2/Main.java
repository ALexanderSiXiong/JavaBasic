package exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int fileName = 1;
        System.out.println("输入 'quit' to exit.");
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Write something here: ");
            String content = input.nextLine();
            if(content.equals("quit")){
                break;
            }
            new FileWritingThread(content, fileName);
            fileName++;
        }
        System.out.println("您已退出");
    }
}
