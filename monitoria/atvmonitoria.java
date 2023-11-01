package monitoria;
import java.util.*;
public class atvmonitoria {
    public static void main(String[] args){
        int i;

        for(i = 0; i<100; i++){
            if(i % 3 == 0){
                System.out.println();
                System.out.println("Fizz");
                System.out.println(i);
            }
            else if(i % 5 == 0){
                System.out.println();
                System.out.println("Buzz");
                System.out.println(i);
            }
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.println();
                System.out.println("Fizz Buzz");
                System.out.println(i);
            }
    }
    }
}
