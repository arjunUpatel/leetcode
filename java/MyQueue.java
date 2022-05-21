import java.util.Stack;

public class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int front;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        front = 0;
    }

    public void push(int x) {
        if (empty())
            front = x;
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        s2.pop();
        int res = front;
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        if (!s2.isEmpty())
            front = s2.peek();
        return res;
    }

    public int peek() {
        return front;
    }

    public boolean empty() {
        if (s1.size() + s2.size() > 0)
            return false;
        return true;
    }
}
