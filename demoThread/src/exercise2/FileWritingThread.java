package exercise2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWritingThread extends Thread{
    private String content;
    private int fileName;

    public FileWritingThread(String content, int fileName){
        System.out.println("Child Thread: " + this);
        this.content = content;
        this.fileName = fileName;
        start();
    }

    @Override
    public void run() {
        try {
            File file = new File(fileName + ".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(content);
            writer.close();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
