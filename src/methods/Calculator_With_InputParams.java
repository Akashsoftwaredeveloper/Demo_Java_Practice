package methods;

public class Calculator_With_InputParams {
       public void addition(int a, int b){
           int result= a+b;
           System.out.println("sum is "+result);
       }
       public void subtraction(int a, int b){
           int result= a-b;
           System.out.println("subtraction is "+result);
       }
       public void multiply(int a, int b){
           int result= a*b;
           System.out.println("multiply of two num is "+result);
       }
       public void division (int a, int b){
           int result= a-b;
           System.out.println("division"+result);
       }

    public static void main(String[] args) {
        Calculator_With_InputParams obj= new Calculator_With_InputParams();
        obj.addition(33,54);
        obj.addition(3,43);
        obj.subtraction(55,23);
        obj.multiply(54,2);
        obj.division(50,25);

    }
}
