import java.lang.reflect.Array;
import java.util.Scanner;

public class Exception_try_catch_java {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[4];
        arr[0]=45;
        arr[1]=75;
        arr[2]=85;
        arr[3]=95;

        System.out.println("enter the no. of index...");
        int ind=sc.nextInt();
        System.out.println("enter the number..");
        int number=sc.nextInt();
        try {
            System.out.println("enter the index no. "+arr[ind]);
            System.out.println(" no. enter by you is " + number);
            System.out.println("the division is arr[ind]/number "+arr[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("some artimatic exception is occured");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("some index out of bound exception is occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some exception is occured");
            System.out.println(e);
        }
    }
}
