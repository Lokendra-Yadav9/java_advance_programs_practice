import java.util.LinkedList;

public class Linkedlist_in_java {
    public static void main(String[] args) {
        LinkedList <Integer> lik1=new LinkedList<>();
        lik1.add(45);
        lik1.add(85);
        lik1.add(96);
        lik1.add(36);
        System.out.println(lik1.getFirst());
        System.out.println(lik1.getLast());
        System.out.println(lik1);
        lik1.addLast(2552);
        lik1.addFirst(48556);
//        lik1.lastIndexOf(36);

        for(Integer linked :lik1){
            System.out.println(linked);
        }
    }
}
