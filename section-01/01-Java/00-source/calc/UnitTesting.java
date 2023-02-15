package calc;
import java.lang.Math;

class UnitTesting {
    public static void main(String[] args) {
        Calculator C = new Calculator();

        runTest (C, "Test 1", "+", 2, 5, 7);
        runTest (C, "Test 2", "-", 2, 5, -3);
        runTest (C, "Test 3", "*", 2, 5, 10);
        runTest (C, "Test 4", "/", 5, 2, 2);

        runTestLog (C, "Test Log 1", 2, 4, 2);
        runTestLog (C, "Test Log 2", 10, 1000, 3);

        runTestSin (C, "Test Sin 1", Math.PI, 0.0);
    }

    private static boolean runTest(Calculator C, String TestName, String op, int op1, int op2, int expected){
        int test_output = C.calculate(op, op1, op2);
        if (test_output == expected){
            System.out.println("Passed: " + TestName + "\n");
            return true;
        }
        else{
            System.out.println("Failed: " + TestName);
            System.out.println("Input operation : " + op1 + " " + op + " " + op2);
            System.out.println("Expected : " + expected + "\tgot : " + test_output + "\n" );
            return false;
        }
    }

    private static boolean runTestLog(Calculator C, String TestName, double base, double number, double expected){
        double test_output = C.log(base, number);
        if (Math.abs(test_output - expected) < 0.001){
            System.out.println("Passed: " + TestName + "\n");
            return true;
        }
        else{
            System.out.println("Failed: " + TestName);
            System.out.println("Input operation : log " + base + " " + number);
            System.out.println("Expected : " + expected + "\tgot : " + test_output + "\n" );
            return false;
        }
    }

    private static boolean runTestSin(Calculator C, String TestName, double number, double expected){
        double test_output = C.sin(number);
        if (Math.abs(test_output - expected) < 0.001){
            System.out.println("Passed: " + TestName + "\n");
            return true;
        }
        else{
            System.out.println("Failed: " + TestName);
            System.out.println("Input operation : sin " + number);
            System.out.println("Expected : " + expected + "\tgot : " + test_output + "\n" );
            return false;
        }
    }
}