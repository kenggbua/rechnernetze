package ProCon;

import java.util.Stack;

public class Producer extends Thread{

    private final Stack<Integer> stack;
    public Producer(Stack<Integer> stack)
    {
        this.stack = stack;
    }
    public void run() {

        int rndNumber = 0;

        for (int i = 0; i < 100; i++) {
            rndNumber = (int) (Math.random() * 100);
            synchronized (stack){
                stack.push(rndNumber);
            }
            System.out.println("push: " + rndNumber);
        }

    }

}
