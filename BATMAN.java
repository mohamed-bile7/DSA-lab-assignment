import java.util.NoSuchElementException;

//Class kaan wuxu leyahay startsize oo manual ah
//haduu full noqdo si automatic buu isku kordhinayyaa
public class BATMAN<T> {
    private T[] data;
    private int top;
    private static final int StartSize = 3;

    public BATMAN() {
        data = (T[]) new Object[StartSize];
        top = 0;
    }

    public void push(T value) {
        if (isFull()) {
            expandManually();
        }
        data[top++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is full.");
        }
        top--;
        T temp = data[top];
        data[top] = null;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is full.");
        }
        return data[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top == data.length;
    }

    private void expandManually() {
        int newSize = data.length * 2;
        T[] biggerArray = (T[]) new Object[newSize];
        for (int i = 0; i < top; i++) {
            biggerArray[i] = data[i];
        }
        data = biggerArray;
    }

    public void showStack() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        System.out.println("Stack contents");
        for (int i = 0; i < top; i++) {
            System.out.println(data[i]);
        }
        System.out.println();
    }
}
