
public class NewThread extends Thread {
    NewThread(String name){
        super(name);
        System.out.println("Child Thread: " + this);

        // Initializing --> run()
        start();
    }

    // The entry point for the second thread
    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Exit child thread.");
    }

    public static void main(String[] args) {
        // create a new thread
        new NewThread("Thread-1");
        // execute the start() in constructor

        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Exit main thread.");
    }

}
