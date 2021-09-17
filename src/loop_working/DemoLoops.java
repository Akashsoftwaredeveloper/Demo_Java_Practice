package loop_working;

public class DemoLoops {

    public static void main(String[] args) {

        // syntax: for (variable declaration ; condition ; variable increment/ decrement) {code}

        for (int i=0; i<=10; i++){
            System.out.println("increment"+i);
        }
        for (int i=10; i>0; i--){
            System.out.println("decrement" +i);
        }
        // While loop statement: while ( condition ) {body}

        int i=0;
        while(i<10){
            System.out.println("while loop statement"+i);
            i++;
        }


    }
}
