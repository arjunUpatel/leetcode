import java.util.Iterator;
import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    int min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.empty())
            min = val;
        else if (val < min)
            min = val;
        stack.push(val);
    }

    public void pop() {
        if (stack.pop() == min && !stack.empty()) {
            min = stack.peek();
            Iterator<Integer> iterator = stack.iterator();
            while (iterator.hasNext()) {
                int num = iterator.next();
                if (num < min)
                    min = num;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
