public class MainThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        // Thread is an object
        System.out.println("Current thread: " + thread);

        // change the name of the thread
        thread.setName("AA Thread");
        System.out.println("After name changed: " + thread);

        try {
            for (int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
    }
}
