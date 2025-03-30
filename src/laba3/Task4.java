package laba3;

class Node2 {
    public int value;
    public Node2 next;

    Node2(int value, Node2 next) {
        this.value = value;
        this.next = next;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Node2 node0 = new Node2(0, null);
        Node2 node1 = new Node2(1, null);
        Node2 node2 = new Node2(2, null);
        Node2 node3 = new Node2(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        Node2 ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}