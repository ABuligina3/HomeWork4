package link;

public class HandMadeLinkedList<E> {
    Node<E> first;
    int size = 0;

    public HandMadeLinkedList() {
        first = null;
    }

    public void InsertFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = first;
        first = newNode;
        size++;
    }

    public void DeleteFirst() {
        first = first.next;
        size--;
    }

    void InsertLast(E data) {
        if (first == null) {
            InsertFirst(data);
        } else {
            Node<E> current = first;
            while (current.next != null) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(data);
            current.next = newNode;
            size++;
        }
    }

    void DeleteAfter(Node<E> after) {
        Node<E> current = first;
        while (current.data != after.data) {
            current = current.next;
        }
    }
}
