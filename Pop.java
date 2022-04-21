package practice;

import java.util.List;

public class Pop extends Thread {
    List<Integer> stack;
    Pop(List<Integer> stack){
        this.stack=stack;
    }

     public void run(){

         while(true){
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             if(!stack.isEmpty()) {
                 stack.remove(0);
                 System.out.print("pop             :");
                 System.out.println(stack);
             }
             if(stack.isEmpty()){
                 try {
                     Thread.sleep(10000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }

         }
     }
}
