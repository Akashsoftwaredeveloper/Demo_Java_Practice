package methods;

public class Calc_withReturnType {

    public int add (int a, int b, int c){
        int result= a+b;
        return result;
    }

    public int  sub (int a, int b) {
        int result = a - b;
        return result;
    }
    public int mult (int a, int b){
        int result=a*b;
        return result;
    }
    public int divide(int a, int b){
        int result=a/b;
        return result;
    }

    public static void main(String[] args) {
        Calc_withReturnType obj= new Calc_withReturnType();
        int var =obj.add(22,33,44);
        System.out.println(var);

        int output= obj.sub(44,32);
        System.out.println(output);

        int out =obj.mult(32,76);
        System.out.println(out);

        int result= obj.divide(44,2);
        System.out.println(result);

    }
}

