public class Runner {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<String> stack2 = new Stack<String>();
        stack2.push("H");
        stack2.push("e");
        stack2.push("l");
        stack2.push("l");
        stack2.push("o");

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}
