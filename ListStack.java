public class ListStack<T> implements Stackable<T> {
    private ListStackItem<T> head;
    private ListStackItem<T> tail = null;
    private int size = 0;

    public void push(T value) {
        ListStackItem<T> objectDoublyNode = new ListStackItem<>(value);
        if (head == null) {
            head = objectDoublyNode;
            tail = objectDoublyNode;

            head.setPrev(null);

            tail.setNext(null);
        } else {
            tail.setNext(objectDoublyNode);
            objectDoublyNode.setPrev(tail);
            tail = objectDoublyNode;
            tail.setNext(null);
        }
        size++;
    }

    public T pop() {
        ListStackItem<T> elem = tail;
        tail = elem.getPrev();
        if (tail != null) {
            tail.setNext(null);
        }
        size--;
        return elem.getValue();
    }

    @Override
    public String toString() {
        String result = "";
        ListStackItem<T> current = head;
        do {
            result = current.toString().concat(" " + result);
            current = current.getNext();
        } while (current != null);
        return result;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return size;
    }

}

class ListStackItem<T> {
    private ListStackItem<T> next;
    private ListStackItem<T> prev;
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListStackItem<T> getNext() {
        return next;
    }

    public ListStackItem<T> getPrev() {
        return prev;
    }

    public void setPrev(ListStackItem<T> prev) {
        this.prev = prev;
    }

    public void setNext(ListStackItem<T> next) {
        this.next = next;
    }

    public ListStackItem(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}