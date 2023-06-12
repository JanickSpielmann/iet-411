package ch.gibb.collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {


        Stack myStack = new Stack<String>();
        myStack.push("Eva");
        myStack.push("Thomas");
        myStack.push("Max");
        myStack.push("Lina");
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack.search("Eva"));
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }
}
