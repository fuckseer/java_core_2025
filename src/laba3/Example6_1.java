package laba3;

class Node1 {
    public int value;
    public Node next;

    Node1(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class Example6_1 {
    public static void main(String[] args) {
        Node head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}


