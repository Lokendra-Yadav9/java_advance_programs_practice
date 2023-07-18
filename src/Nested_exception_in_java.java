import java.util.Scanner;
public class Nested_exception_in_java {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] marks = new int[5];
        marks[0]=55;
        marks[1]=65;
        marks[2]=75;
        marks[3]=25;
        marks[4]=5;

        boolean rerun=true;
        while (rerun) {
            System.out.println("enter the number of index");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome try1");
                try {
                    System.out.println("the value on the index no. is " + marks[ind]);
                    rerun=false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("sorry this is index exception this is level 2");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("this is level 1 in e");
            }
        }
    }
}
