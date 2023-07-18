import java.util.Scanner;
class MyThrows extends Exception{

    public String toString(){
        return "the radius can not a minus ";
    }
    public String getMessage(){
        return "this is get message we can not run this function";
    }


}

public class Throw_and_Throws_in_java  {
//    public static int Sum(int a,int b) throws Exception{
//        int result = a / b;
//        return result;
//    }

    public static double Area(int a) throws Exception{

            if(a<0){
                throw new MyThrows();
            }
            double result =Math.PI*a*a;
            return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean rerun=true;
        while (rerun) {
            System.out.println("enter the value of radius");
            int a = sc.nextInt();
            try {
//            int c=Sum(15,0);
                double c = Area(a);
                System.out.println(c);
                rerun=false;
            } catch (Exception e) {
                System.out.println("sorry for exception " + e);
                System.out.println(e.getMessage());
            }
        }
    }
}
