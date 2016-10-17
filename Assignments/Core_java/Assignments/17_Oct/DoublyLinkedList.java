class Node{
	int data;
	Node prev;
	Node next;
}
public class DoublyLinkedList{
	private Node head;
	
	public DoublyLinkedList(int number){
		this.head = new Node();
		this.head.data = number;
		this.head.prev = null;
		this.head.next = null;
	}
	public void insertNode(int number){
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new Node();
		temp.next.data = number;
		temp.next.next = null;
		temp.next.prev = temp;
	}
	public void deleteNode(int number){
		Node temp = head;
		while(temp!=null&&temp.data!=number){
			temp = temp.next;
		}
		if(temp!=null){
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			temp = null;
			}
	}
	public int countNodes(){
		Node temp = head;
		int count = 0;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	public void printNodes(){
		Node temp = head;
		while(temp!=null){
			System.out.println("Data : "+temp.data);
			temp = temp.next;
		}
	}
}