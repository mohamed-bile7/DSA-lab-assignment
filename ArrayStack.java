public class ArrayStack {
    public static void main(String[] args) {
        try
        {
            ArrayStack stack = new ArrayStack();
            System.out.println("Empty check: "+stack.isEmpty());
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            System.out.println("Popped: "+stack.pop());
            stack.push(50);
            System.out.println("Top element: "+stack.peek());
            stack.showStack();
            System.out.println("Stack size: "+stack.size());
            stack.push(60);
            stack.push(70);
            stack.push(80);
            stack.push(90);
            System.out.println("Popped: "+stack.pop());
            stack.push(100);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    int[] stack;
    int top;
    int maxsize;

    ArrayStack()
    {
        maxsize = 5;
        top = -1;
        stack = new int[maxsize];
    }

    boolean isFull()
    {
        return top == maxsize -1;
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    void push(int item)throws Exception
    {
        if (isFull()){
            expand();
            System.out.println("Stack was full — auto expanded!");
        }
        stack[++top] = item;
        System.out.println("You pushed: "+item);
    }

    int pop()throws Exception
    {
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stack[top--];
    }

    int peek() throws Exception
    {
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stack[top];
    }

    int size()
    {
        return top + 1;
    }

    void expand()
    {
        int newsize = maxsize * 2;
        int[] biggerArray = new int[newsize];
        System.arraycopy(stack, 0, biggerArray, 0, top + 1);
        stack = biggerArray;
    }

    void showStack()throws Exception
    {
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        System.out.println("--Stack content--");
        for (int i = 0; i < top + 1; i++){
            System.out.println(stack[i]);
        }
    }
}
