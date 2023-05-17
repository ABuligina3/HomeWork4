public class PriorityQueue {
    private int[] items;
    private final int SIZE;
    int front, rear;

    PriorityQueue(int size) {
        front = rear = -1;
        SIZE = size;
        items = new int[SIZE];
    }

    private boolean isFull() {
        if (front == -1 && rear == SIZE - 1) return true;
        else return false;
    }

    private boolean isEmpty() {
        if (front == -1) return true;
        else return false;
    }

    public boolean contains(int element) {
        for (int i = front; i <= rear; i++) {
            if (items[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void enQueue(int element) {
        if (isFull()) System.out.println("Очередь заполнена");
        else {
            if (isEmpty()) front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Добавлен объект " + element);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        } else {
            int element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Удалён объект " + element);
            return element;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        } else {
            return items[front];
        }
    }

    void display() {
        int i;
        if (isEmpty()) System.out.println("Пустая очередь");
        else {
            System.out.println("Индексы FRONT и REAR: " + front + " " + rear);
            System.out.println("Элементы очереди: ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

    public int size() {
        return (rear - front) + 1;
    }

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(5);
        q.deQueue();
        q.enQueue(3);
        q.display();
        q.enQueue(5);
        q.enQueue(1);
        q.enQueue(6);
        q.display();
        q.enQueue(2);
        q.enQueue(4);
        q.display();
        q.deQueue();
        q.display();
    }
}
