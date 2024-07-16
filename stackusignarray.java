package stackandqueue;

public class stackusignarray {

    static int[] arr = new int[5];
    static int top = -1;

    public static void main(String[] args) {
        pop(); // Attempt to pop from an empty stack
        push(5); // Push 5
        push(10); // Push 10
        push(15); // Push 15
        push(20); // Push 20
        push(25); // Push 25
        push(30); // Attempt to push 30, should show "Stack is full"

        System.out.println("Element popped: " + pop()); // Pop 25
        System.out.println("Element popped: " + pop()); // Pop 20
    }

    public static void push(int item) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = item;
            System.out.println(item + " pushed to stack");
        }
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; // Return a sentinel value to indicate stack is empty
        } else {
            int item = arr[top--];
            System.out.println(item + " popped from stack");
            return item;
        }
    }
}
