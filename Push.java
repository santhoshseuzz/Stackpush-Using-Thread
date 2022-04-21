package practice;

import java.util.List;

public class Push extends Thread {
    List<Integer> stack;
    Push(List<Integer> stack){
        this.stack =stack;
    }
    static  int max =10;

    public void run() {
            while (true) {
                if (stack.size() == max) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(stack.size()<=10) {
                    stack.add(10);
                }
                if(stack.isEmpty()){

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("push    :");
                System.out.println(stack);
                stack.notifyAll();
            }
        }
}
