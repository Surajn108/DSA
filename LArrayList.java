import java.util.ArrayList ;
import java.util.LinkedList ;
import java.util.Stack ;
public class LArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        LinkedList<Integer> l3 = new LinkedList<>();

        l1.add(39);
        l1.add(53);
        l1.add(59);
        System.out.println(l1);
        l1.remove(0);
        System.out.println(l1);
        l1.add(0 ,54);
        l1.set(0 , 48);
        System.out.println(l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(32 );
        l2.add(43 );
        l2.add(25 );
        l1.addAll(l2);
        System.out.println(l1.contains(25));
        System.out.println(l2);
        System.out.println(l1);


        Stack<String> animalsStack = new Stack<>();

        animalsStack.push("Tiger");
        animalsStack.push("cat");
        animalsStack.peek();
        System.out.println( animalsStack.peek());

        System.out.println("Animals :" + animalsStack);


    }
}
