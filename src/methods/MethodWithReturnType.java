package methods;

public class MethodWithReturnType {

    public String demo(){
        String name= "Akash";
        return name;
    }
    public int integer(){
        int num= 33;
        return num;
    }
    public String message (String msg ){
        String output= "Hello "+msg;
        return output;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj=new MethodWithReturnType();
        String var= obj.demo();
        System.out.println(var);

        int output =obj.integer();
        System.out.println(output);

        String result= obj.message("akash");
        System.out.println(result);
    }
}
