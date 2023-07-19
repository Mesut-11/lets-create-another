package stacks;

import java.util.Stack;

public class Stacks {
    public Stack<String> stringStack;

    public void getStacks(){
        stringStack = new Stack<>();
        stringStack.push("Software Development");
        stringStack.push("Software Engineering");
        stringStack.push("Software Architect");
        stringStack.push("Dev Ops");
        System.out.println(stringStack.peek());
    }
}
