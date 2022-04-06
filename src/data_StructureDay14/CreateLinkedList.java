package data_StructureDay14;

public class CreateLinkedList {

    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
    	CreateLinkedList linkedList = new CreateLinkedList();

        linkedList.head = new Node(56);
        Node second = new Node(30);
        Node Third = new Node(70);

        linkedList.head.next = second;
        second.next = Third;

        // Print the Data with Values
        while (linkedList.head != null) {
            System.out.println(linkedList.head.data);
            linkedList.head = linkedList.head.next;
        }
    }
}