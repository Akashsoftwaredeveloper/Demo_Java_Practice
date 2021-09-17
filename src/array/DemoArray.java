package array;

public class DemoArray {
    public void demo() {
        // Syntax of Array : Data Type [] Object_name = {,,,,,,,};

        String[] nameArray = {"raj", "ram", "surendr", "Laxman"};

        for (String var : nameArray) {
            System.out.println(var);
        }
        int [] marksArray={43,45,34,34,76,765,879,754};

        for (int var:marksArray){
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        DemoArray obj =new DemoArray();
        obj.demo();
    }

    }

