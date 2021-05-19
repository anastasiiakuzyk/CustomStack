import java.lang.reflect.Array;

public class ArrayStack<T> implements Stackable<T> {
    private T[] array;
    private final int MAX = 1000;
    private int topIndex = -1;

    public ArrayStack() {
        array = (T[]) Array.newInstance(Comparable.class, MAX);
    }

    private boolean isStackOverflow() {
        return topIndex + 1 > 1000;
    }

    public void push(T elem) {
        if (!isStackOverflow()) {
            topIndex++;
            array[topIndex] = elem;
        } else {
            throw new StackOverflowError();
        }
    }

    public T pop() {
        T elem = array[topIndex];
        topIndex--;
        return elem;
    }

    @Override
    public String toString() {
        String result = "";
        if (topIndex < 0) {
            return result;
        }
        for (int i = topIndex; i >= 0; i--) {
            result += array[i] + " ";
        }
        return result;
    }

    public boolean isEmpty() {
        return topIndex < 0;
    }

    public int size() {
        return array.length;
    }
}
