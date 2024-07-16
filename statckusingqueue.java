package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

class stackusingqueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public static void main(String[] args) {
        stackusingqueue s = new stackusingqueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.q1);
        System.out.println(s.q2);
    }

    static int cnt = 0;

    // Function to push an element into stack using two queues.
    void push(int a) {

        q1.add(a);
        cnt++;
        if (cnt > 1) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(q2.remove());
        }
        // Your code here
    }

    // Function to pop an element from stack using two queues.
    // int pop() {
    // // Your code here
    // }

}
