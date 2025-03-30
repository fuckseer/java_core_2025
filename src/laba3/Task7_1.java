package laba3;

class Node3 {
    public int value;
    public Node3 next;

    public Node3(int value, Node3 next) {
        this.value = value;
        this.next = next;
    }
}

public class Task7_1 {
    private Node3 head;

    public void insertAtHead(int value) {
        Node3 newNode = new Node3(value, head);
        head = newNode;
    }

    public void printList() {
        Node3 ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task7_1 list = new Task7_1();

        list.insertAtHead(0);
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);

        System.out.print("Список после добавления с головы: ");
        list.printList();
    }
}


