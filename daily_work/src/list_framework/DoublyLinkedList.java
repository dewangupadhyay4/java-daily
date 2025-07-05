package list_framework;

public class DoublyLinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node temp=head;
		while(temp.next != null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		
	}
	
		public void displayForward() {
			Node temp=head;
			System.out.println("Forward: ");
			while(temp !=null) {
				System.out.println(temp.data+"");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public void displayBackward() {
			if(head==null) return;
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
		}
		
		public static void main(String[] args) {
			DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
			doublyLinkedList.insert(20);
			doublyLinkedList.insert(30);
			doublyLinkedList.insert(40);
			doublyLinkedList.insert(90);
			doublyLinkedList.insert(12);
			doublyLinkedList.displayForward();
			doublyLinkedList.displayBackward();
		}

}
