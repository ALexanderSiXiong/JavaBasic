package exercise1;

public class ChildThread extends Thread{
    // print in different threads

    // print letters from a - z
    // print letters from A - Z
    // print numbers from 1 - 100 in main thread
    private char letter;
    public ChildThread(char letter){
        this.letter = letter;
        start();
    }

    public void run(){
        try {
            int times = 1;
            while(times < 27){
                System.out.println(letter);
                letter++;
                times++;
                Thread.sleep(10);
            }

        } catch (InterruptedException e){
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Exit child thread.");
    }

    public static void main(String[] args) {
        new ChildThread('a');
        new ChildThread('A');
        try {
            for (int i = 1; i <= 100; i++){
                System.out.println("Main thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Exit main thread.");
    }
}
