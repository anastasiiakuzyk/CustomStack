import java.util.ArrayList;

public class ArrayStack<T> implements Stackable<T> {
    private ArrayList<T> array = new ArrayList<>();

    public void push(T elem) {
        this.array.add(0, elem);
    }

    public T pop() {
        T elem = this.array.get(0);
        this.array.remove(0);
        return elem;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < array.size(); i++) {
            result = result.concat(array.get(i).toString() + " ");
        }
        return result;
    }

    public boolean isEmpty() {
        return this.array.size() == 0;
    }

    public int size() {
        return this.array.size();
    }
}
