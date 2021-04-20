public interface Stackable<T> {
    void push(T value);
    T pop();
    boolean isEmpty();
    int size();
}
