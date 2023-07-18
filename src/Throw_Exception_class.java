
import  java.util.Scanner;
class  MyExclass extends Exception{
    public String toString(){
        return "this will return String";
    }
    public String toString2(){
        return "this will return String";
    }

    public String getMessage(){
        return "this is get masseges";
    }
 }
public class Throw_Exception_class {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter an number less than 9");
        int num= sc.nextInt();
        if(num<9){
            try{
                throw new MyExclass();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e); // this will also return to String function

            }
        }
    }
}
