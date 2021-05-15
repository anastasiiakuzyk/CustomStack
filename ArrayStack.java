import java.lang.reflect.Array;

public class ArrayStack<T> implements Stackable<T> {
    private T[] array;
    private final int MAX = 1000;
    private int top = -1;

    public ArrayStack(){
        array = (T[]) Array.newInstance(Comparable.class, MAX);
    }

    private boolean isStackOverflow() {
        return top+1 > 1000;
    }

    public void push(T elem) {
        if (!isStackOverflow()) {
            top++;
            this.array[top] = elem;
        } else {
            throw new StackOverflowError();
        }
    }

    public T pop() {
        T elem = this.array[top];
        top--;
        return elem;
    }

    @Override
    public String toString() {
        String result = "";
        if (top < 0) {
            return result;
        }
        for (int i = top; i >= 0; i--) {
            result = result.concat(array[i].toString() + " ");
        }
        return result;
    }

    public boolean isEmpty() {
        return this.top < 0;
    }

    public int size() {
        return this.array.length;
    }
}
