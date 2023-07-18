
public class Finally_block{
    public static int Divide(){

        try{
            int a=6;
            int b=2;
            int c=a/b;
           return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("it could be finally...");
        }
        return 0;
    }

    public static void main(String[] args) {
//        int k=Divide();
//        System.out.println(k);
        int a=10;
        int b=8;
        while (true){
            try{
                System.out.println(a/b);
        }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("the value of b is "+b);
            }
            b--;
            }
    }
}
