import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private int number;
    
    public Fibonacci (int number){
        this.number = number;
    }

    public String makeFibonacci (int number){
        List<Integer> fibonacci = new ArrayList<>();
        String str = "";
        if (number == 0){
            return str;
        }
        if (number == 1){
            return "0";
        }
        if (number == 2){
            return "0, 1";
        }
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i < number; i++){
            int num1 = i - 1;
            int num2 = i - 2;
            fibonacci.add(fibonacci.get(num1)+fibonacci.get(num2));
        }
        for (int n : fibonacci){
            str += n + " ";
        }
        System.out.println(str);
        return str;
    }
    
}
