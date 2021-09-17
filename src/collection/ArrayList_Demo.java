package collection;

import java.util.ArrayList;

public class ArrayList_Demo {
    public void demo(){
        // Syntax of ArrayList: Data_type object name = new ArrayList ();
        ArrayList Employ_name = new ArrayList();

        // Add method
        Employ_name.add("Raja");// 0 index
        Employ_name.add("Sandeep kumar");// 1 index
        Employ_name.add("Surendre");// 2 index
        Employ_name.add("Dharmendre");// 3 index
        Employ_name.add("Ram"); // 4 index
        Employ_name.add("Kanaiya");// 5  index
        Employ_name.add("Laxman");// 6 index

        // Get Method
        System.out.println("Printing element using Get method  "+Employ_name.get(0));
        System.out.println("Printing element using Get method  "+Employ_name.get(1));
        System.out.println("Printing element using Get method  "+Employ_name.get(2));
        System.out.println("Printing element using Get method  "+Employ_name.get(3));
        System.out.println("Printing element using Get method  "+Employ_name.get(4));
        System.out.println("Printing element using Get method  "+Employ_name.get(5));
        System.out.println("Printing element using Get method  "+Employ_name.get(6));

        // Advance for Loop: for(Data_type var: object_name)

        for (Object var:Employ_name){
            System.out.println(var);
        }
        // remove method
        Employ_name.remove(0);
        Employ_name.remove(1);
        Employ_name.remove(2);

        // advance loop

        for (Object var: Employ_name){
            System.out.println("After removing method  "+ var);
        }
    }

    public static void main(String[] args) {
        ArrayList_Demo obj= new ArrayList_Demo();
        obj.demo();
    }
}
