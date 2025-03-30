package laba3;


public class Task7_2 {
    private Node head;

    public void insertAtTail(int value) {
        Node newNode = new Node(value, null);
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

    public void printList() {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task7_2 list = new Task7_2();

        list.insertAtTail(0);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);

        System.out.print("список после добавления с хвоста: ");
        list.printList();
    }
}
