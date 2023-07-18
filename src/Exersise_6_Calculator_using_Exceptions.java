class InvalidInpiutException extends Exception{
    @Override
    public String toString() {
//        System.out.println("this is invalid input");
        return  "this is invalid input";

    }
}
class CanNotDIvideZero extends Exception{
    @Override
    public String toString() {
//        System.out.println("this is invalid input");
        return  "Can not divide by 0";

    }
}
class MaxInputExpe extends Exception{
    @Override
    public String toString() {
//        System.out.println("this is invalid input");
        return  "this is input is out of Maximum range ";

    }
}
class MultiplyMaxInput extends Exception{
    @Override
    public String toString() {
//        System.out.println("this is invalid input");
        return  "this is out of multiply maximum input ";

    }
}
class Calculator{
    public void add(double a,double b) throws InvalidInpiutException,MaxInputExpe{
            if (a==8||b==9){
                throw new InvalidInpiutException();
            }
                System.out.println("the addition is " + (a + b));
        }

    public void substract(double a,double b) throws MaxInputExpe {
        if (a>10000 ||b>10000){
            throw new MaxInputExpe();
        }
            System.out.println("the Substract is " + (a - b));
    }
    void multiply(double a,double b)throws MaxInputExpe{
        if (a>7000 ||b>7000){
            throw new MaxInputExpe();
        }
            System.out.println("the multiply is " + (a * b));
    }

    void Divide(double a,double b) throws CanNotDIvideZero,MaxInputExpe{
        if (a>10000 ||b>10000){
            throw new MaxInputExpe();
        }
        if (a==0 ||b==0){
            throw new CanNotDIvideZero();
        }
            System.out.println("the Divide is " + (a / b));
    }
}

public class Exersise_6_Calculator_using_Exceptions{
    public static void main(String[] args) throws MaxInputExpe,InvalidInpiutException,CanNotDIvideZero,MultiplyMaxInput{
            Calculator c1=new Calculator();
//             c1.add(8,9);
        c1.Divide(1500000,0);

    }
}
