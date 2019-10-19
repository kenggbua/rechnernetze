package ProCon;

import java.util.Stack;

public class Consumer extends Thread {
    private final Stack<Integer> stack;
    public Consumer(Stack<Integer> stack)
    {
        this.stack = stack;
    }
    public void run() {
        int rndNumber = (int) (Math.random() * 100);
        int count = 0;
        int sum = 0;

        while(count<rndNumber){
            while (stack.empty()){
                try {
                    sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            synchronized (stack){
                sum+=stack.pop();
                count++;
                System.out.println("current sum: " + sum);
            }
        }

        System.out.println("counter: " + count + " summe: " + sum);


    }


}
