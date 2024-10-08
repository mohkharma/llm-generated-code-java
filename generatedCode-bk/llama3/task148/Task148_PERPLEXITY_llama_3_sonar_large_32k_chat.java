package llama3.task148;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Can't push " + item);
            return;
        }
        stackArray[++top] = item;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Can't pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

public class Task148_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());  // 3
        System.out.println(stack.peek());  // 2
        System.out.println(stack.isEmpty());  // false
    }
}