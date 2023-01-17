package sdf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // Thread thread1 = new Thread(new Runnable() {
        //     @Override
        //     public void run(){
        //         for (int i = 0; i < 5; i ++) {
        //             System.out.println(Thread.currentThread().getName() + "\t Runnable ..." + i);
        //         }
        //     }
        // });
        // thread1.start();

        MyRunnableImplementation mRI = new MyRunnableImplementation("Task 1"); //Assign names to distinguish threads
        MyRunnableImplementation mRI2 = new MyRunnableImplementation("Task 2");
        MyRunnableImplementation mRI3 = new MyRunnableImplementation("Task 3");
        MyRunnableImplementation mRI4 = new MyRunnableImplementation("Task 4");
        MyRunnableImplementation mRI5 = new MyRunnableImplementation("Task 5");
        // //Need to put runnable inside thread to run
        // Thread thread2 = new Thread(mRI);
        // thread2.start();

        // Thread thread3 = new Thread(mRI);
        // thread3.start();

        //Instantiate the single thread executor service
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // executorService.execute(mRI);
        // executorService.execute(mRI2);
        // executorService.shutdown();

        //Instantiate fixed thread pool executor service
        // ExecutorService executorService = Executors.newFixedThreadPool(3); //3 working threads to process tasks
        // // ExecutorService executorService2 = Executors.newFixedThreadPool(3);
        // executorService.execute(mRI);
        // executorService.execute(mRI2);
        // executorService.execute(mRI3);
        // executorService.execute(mRI4);
        // executorService.execute(mRI5);
        // executorService.shutdown();
        
         //Instantiate cache thread pool executor service
         ExecutorService executorService = Executors.newCachedThreadPool();
         executorService.execute(mRI);
         executorService.execute(mRI2);
         executorService.execute(mRI3);
         executorService.execute(mRI4);
         executorService.execute(mRI5);
         executorService.shutdown();

         //Lambda expressions in action 
         //Addition Runnable Interface
         MyRunnableInterface<Integer> addOperation = (a, b) -> {
            return a + b;
         };

         //Multiply Runnable Interface
         MyRunnableInterface<Integer> multiplyOperation = (a, b) -> {
            return a * b;
         };

         //Minus Runnable Interface
         MyRunnableInterface<Integer> minusOperation = (a, b) -> {
            return a - b;
         };

         //Concat String
         MyRunnableInterface<String> concatString = (a, b) -> {
            return a + b;
         };

         System.out.println("addOperation: " + addOperation.process(1, 1));
         System.out.println("multiplyOperation: " + multiplyOperation.process(2, 5));
         System.out.println("minusOperation: " + minusOperation.process(10, 2));
         System.out.println("concat: " + concatString.process("Happy", " day!"));

    }
}
