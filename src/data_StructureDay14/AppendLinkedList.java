package data_StructureDay14;

public class AppendLinkedList {

	    public Node head;
	    public Node tail;
	    static class Node {
	        int data;
	        Node next;

	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }

	    // Adding new Node with data
	    public void add(int datas){
	        Node newNode = new AppendLinkedList.Node(datas);
	        if(head == null){
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    // Display the Node with value
	    public void display() {
	        Node current = head;
	        if(head == null) {
	            System.out.println("List is empty");
	        }
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }

	    public static void main(String[] args) {
	    	AppendLinkedList list = new AppendLinkedList();

	        list.add(56);
	        list.add(30);
	        list.add(70);
	        list.display();

	    }
	}

