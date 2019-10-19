package ProCon;

import java.util.Stack;

public class Producer extends Thread{

    private Stack<Integer> stack;
    public Producer(Stack<Integer> stack)
    {
        this.stack = stack;
    }
    public void run() {

        int rndNumber = 0;

        for (int i = 0; i < 12354; i++) {
            rndNumber = (int) (Math.random() * 12502);
            synchronized (stack){
                stack.push(rndNumber);
            }
            System.out.println("push: " + rndNumber);
        }

    }

}
