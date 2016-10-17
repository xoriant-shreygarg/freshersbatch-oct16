public class DoublyLinkedListTest{
	
	public static void main(String args[]){
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.insertNode(2);
		dll.insertNode(3);
		dll.insertNode(4);
		dll.insertNode(5);
		System.out.println(""+dll.countNodes());
		dll.printNodes();
		dll.deleteNode(3);
		System.out.println(""+dll.countNodes());
		dll.printNodes();
	}
	
}