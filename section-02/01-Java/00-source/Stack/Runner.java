public class Runner {
    public static void main(String[] args){
        /*Stack<Integer> stack = new Stack<Integer>(); 
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("A");
        stack.push("R");
        stack.push("O");
        stack.push("N");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
