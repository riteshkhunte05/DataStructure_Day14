package data_StructureDay14;

	public class DeleteLastElement {
		
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

	    // Adding new Node with values
	    public void add(int datas){
	        Node newNode = new Node(datas);
	        if(head == null){
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            newNode.next = head;
	            head = newNode;
	        }
	    }

	    // Display the Node with value
	    public void display() {
	        Node current = head;
	        if(head == null) {
	            System.out.println("List is empty");
	        }
	        while (current != null) {
	            System.out.println(current.data +" ");
	            current = current.next;
	        }
	    }
		// Deleting the LastNode with Value
	    public void pop() {

	        //Checks if the list is empty
	        if(head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        else {
	            if(head != tail ) {
	                Node current = head;
	                while(current.next != tail) {
	                    current = current.next;
	                }
	                tail = current;
	                tail.next = null;
	            }
	            else {
	                head = tail = null;
	            }
	        }
	    }

	    public static void main(String[] args) {
	    	DeleteLastElement list = new DeleteLastElement();

	        list.add(70);
	        list.add(30);
	        list.add(56);
	      
	        list.pop();
	        list.display();
	    }
	}

