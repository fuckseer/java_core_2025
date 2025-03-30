package laba3;


class LinkedListRecursive {

    // надоело нумеровать)
    static class Node {
        public int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;

    public LinkedListRecursive() {
        this.head = null;
    }

    public void createHeadRec(int[] values) {
        createHeadRecHelper(values, 0);
    }

    private void createHeadRecHelper(int[] values, int index) {
        if (index >= values.length) {
            return;
        }
        AddFirst(values[index]);
        createHeadRecHelper(values, index + 1);
    }

    public void createTailRec(int[] values) {
        createTailRecHelper(values, 0);
    }

    private void createTailRecHelper(int[] values, int index) {
        if (index >= values.length) {
            return;
        }
        AddLast(values[index]);
        createTailRecHelper(values, index + 1);
    }

    public String toStringRec() {
        StringBuilder sb = new StringBuilder();
        toStringRecHelper(head, sb);
        return sb.toString().trim();
    }

    private void toStringRecHelper(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append(node.value).append(" ");
        toStringRecHelper(node.next, sb);
    }

    public void AddFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }
}


public class Task8_b {
    public static void main(String[] args) {
        LinkedListRecursive recList = new LinkedListRecursive();

        int[] recValuesHead = {3, 2, 1, 0};
        recList.createHeadRec(recValuesHead);
        System.out.print("createHeadRec: " + recList.toStringRec() + "\n"); //  0 1 2 3

        int[] recValuesTail = {4, 5, 6};
        recList.createTailRec(recValuesTail);
        System.out.print("createTailRec: " + recList.toStringRec() + "\n"); //  0 1 2 3 4 5 6

        String listStringRec = recList.toStringRec();
        System.out.println("toStringRec(): " + listStringRec); // 0 1 2 3 4 5 6
    }
}

