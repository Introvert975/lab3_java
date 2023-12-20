import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        String str1 = "stroka1";
        String str2 = "strokafsdf2";
        Stack<Object> stack1 = new Stack<>();
        Stack<Object> stack2 = new Stack<>();
        for(int i=0; i < str1.length();i++){
            stack1.push(str1.charAt(i));

        }
        for(int i=0; i < str2.length();i++){

            stack2.push(str2.charAt(i));
        }

        System.out.println("Стек 1(до перестоновки):"+stack1);
        System.out.println("Стек 2(до перестоновки):"+stack2);
        Stack<Object> memory = new Stack<>();

        memory.addAll(stack1);
        stack1.removeAllElements();
        stack1.addAll(stack2);
        stack2.removeAllElements();
        stack2.addAll(memory);



        System.out.println("Стек 1(после перестоновки):"+stack1);
        System.out.println("Стек 2(после перестоновки):"+stack2);
    }
}