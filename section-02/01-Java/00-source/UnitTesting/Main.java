package calc;
import java.io.Console;

class Main {
    public static void main(String[] args) {
        Console cnsl = System.console();
        Calculator C = new Calculator();

        while(true){
            String str = cnsl.readLine("Enter calculation : ");
            if (str.equals("exit"))
                break;

            String [] expr = str.split(" ", 3);
            System.out.println("The result is : " + 
                C.calculate(expr[1], 
                            Integer.parseInt(expr[0]),
                            Integer.parseInt(expr[2]))); 
        }
    }
}