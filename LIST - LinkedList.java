import java.util.*;

public class SimpleLinkedList<T> {

    public Node head = null;
    public Node tail = null;

    public SimpleLinkedList(T[] values) {
        Arrays.stream(values).forEach(this::push);
    }

    public SimpleLinkedList() {
    }

    public int size() {
        if (head == null) return 0;
        int count = 1;
        Node currentNode = head;
        while (currentNode.next != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public T pop() {
        if (head == null) throw new NoSuchElementException();
        T result = head.data;
        if (size() == 1) {
            head = null;
            tail = null;
            return result;
        }
        Node currentNode = head;
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }
        result = tail.data;
        currentNode.next = null;
        tail = currentNode;
        return result;
    }

    public void push(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void reverse() {
        List<T> list = getList(head);
        head = null;
        tail = null;
        list.forEach(this::push);
    }

    public Character[] asArray(Class<T> characterClass) {
        return getList(head).toArray(new Character[0]);
    }

    private List<T> getList(Node currentNode) {
        if (currentNode == null) return new ArrayList<>();
        if (currentNode == tail) return new ArrayList<>(Collections.singletonList(currentNode.data));

        List<T> result = getList(currentNode.next);
        result.add(currentNode.data);
        return result;
    }

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}