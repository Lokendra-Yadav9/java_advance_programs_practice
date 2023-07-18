import java.util.ArrayDeque;
import java.util.Scanner;
public class Array_Deque_in_java {
    public static void main(String[] args) {
        ArrayDeque <Integer> Ad1=new ArrayDeque<>();
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        Ad1.add(1);
        Ad1.add(2);
        Ad1.add(3);
        Ad1.add(4);
        Ad1.add(5);
        Ad1.addFirst(11);
        Ad1.addLast(20);
//        Ad1.offerFirst(k);

        for(Integer NewDeq:Ad1){
            System.out.println(NewDeq);
        }
    }
}
