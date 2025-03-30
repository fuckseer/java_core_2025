package laba3;

class Node5 {
    public int value;
    public Node5 next;

    public Node5(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedListIterative {
    private Node5 head;

    public LinkedListIterative() {
        this.head = null;
    }
    public void createHead(int[] values) {
        for (int value : values) {
            AddFirst(value);
        }
    }

    public void createTail(int[] values) {
        for (int value : values) {
            AddLast(value);
        }
    }

    // Пришлось переписать метод
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node5 ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }

    public void AddFirst(int value) {
        Node5 newNode = new Node5(value);
        newNode.next = head;
        head = newNode;
    }

    // Добавление элемента в конец списка
    public void AddLast(int value) {
        Node5 newNode = new Node5(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node5 ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }

    public void Insert(int index, int value) {
        if (index < 0) {
            System.out.println("индекс не может быть отрицательным.");
            return;
        }
        if (index == 0) {
            AddFirst(value);
            return;
        }

        Node5 newNode = new Node5(value);
        Node5 ref = head;
        int currentIndex = 0;

        while (ref != null && currentIndex < index - 1) {
            ref = ref.next;
            currentIndex++;
        }

        if (ref == null) {
            System.out.println("индекс превышает размер списка - добавление в конец");
            AddLast(value);
            return;
        }

        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void RemoveFirst() {
        if (head == null) {
            System.out.println("список пуст");
            return;
        }
        head = head.next;
    }

    public void RemoveLast() {
        if (head == null) {
            System.out.println("список пуст");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node5 ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void Remove(int index) {
        if (head == null) {
            System.out.println("список пуст");
            return;
        }
        if (index < 0) {
            System.out.println("индекс не может быть отрицательным.");
            return;
        }
        if (index == 0) {
            RemoveFirst();
            return;
        }

        Node5 ref = head;
        int currentIndex = 0;

        while (ref.next != null && currentIndex < index - 1) {
            ref = ref.next;
            currentIndex++;
        }

        if (ref.next == null) {
            System.out.println("индекс больше размера списка");
            return;
        }

        ref.next = ref.next.next;
    }
}

public class Task8_a {
    public static void main(String[] args) {
        LinkedListIterative list = new LinkedListIterative();

        int[] valuesHead = {3, 2, 1, 0};
        list.createHead(valuesHead);
        System.out.print("createHead: " + list + "\n"); // 0 1 2 3

        list.AddFirst(-1);
        System.out.print("AddFirst(-1): " + list + "\n"); // -1 0 1 2 3
        list.AddLast(4);
        System.out.print("AddLast(4): " + list + "\n"); // -1 0 1 2 3 4

        list.Insert(3, 99);
        System.out.print("Insert(3, 99): " + list + "\n"); // -1 0 1 99 2 3 4

        list.RemoveFirst();
        System.out.print("RemoveFirst(): " + list + "\n"); // 0 1 99 2 3 4

        list.RemoveLast();
        System.out.print("RemoveLast(): " + list + "\n"); // 0 1 99 2 3

        list.Remove(2);
        System.out.print("После Remove(2): " + list + "\n"); // 0 1 2 3
    }
}