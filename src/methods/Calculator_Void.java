package methods;

public class Calculator_Void {
    public void addition(){

        // Addition method
        int a=33;
        int b=43;
        int result= a+b;
        System.out.println("addition of two number is " +result);
    }
    public void multiply(){
        int a= 32;
        int b= 43;
        int result= a*b;
        System.out.println("Multiply of two number is "+result);
    }
    public void subtraction(){
        int a=54;
        int b=32;
        int result=a-b;
        System.out.println("subtraction of two number is " +result);
    }
    public void division(){
        int a = 50;
        int b = 5;
        int result=a/b;
        System.out.println("division of two number is "+result);
    }

    public static void main(String[] args) {
        Calculator_Void object= new Calculator_Void();
        object.addition();
        object.division();
        object.multiply();
        object.subtraction();
    }
}
