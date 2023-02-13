package calc;

class Calculator {
    public Calculator(){
    }

    public int calculate(String op, int op1, int op2) {
        if (op.equals("+"))
            return op1 + op2;
        else if (op.equals("-"))
            return op1 - op2;
        else if (op.equals("*"))
            return op1 + op2;
        else if (op.equals( "/"))
            return op1 / op2;
        else
            return 0;
    }

    public double log(double base, double number){
        System.out.println("log function not implemented");
        return -1;
    }
}