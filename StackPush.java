package practice;

import java.util.ArrayList;

public class StackPush {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> contar = new ArrayList<>();
        Push obj = new Push(contar);
        obj.start();
        Pop obj1 = new Pop(contar);
        obj1.start();
    }

}
