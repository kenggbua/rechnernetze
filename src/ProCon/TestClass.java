package ProCon;

import java.util.Stack;

public class TestClass {
    public static void main(String[] args)
    {
        Stack<Integer> sharedStack = new Stack<>();
        Producer producer = new Producer(sharedStack);
        Consumer consumer = new Consumer(sharedStack);

        consumer.start();
        producer.start();

        try {
            consumer.join();
            producer.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
