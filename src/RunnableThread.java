public class RunnableThread {
    static class NewThread implements Runnable{
        private String name;
        private Thread thread;

        NewThread(String name){
            this.name = name;

            // the essence of it is create a thread here
            thread = new Thread();
            System.out.println("Thread: "+ thread);
            thread.start();
        }

        @Override
        public void run() {
            for(int i = 5; i > 0; i--){
                System.out.println(name +": " + i);
            }
            System.out.println(name + " exits.");
        }
    }

}
