package com.demo.test;

public class DoublyLinkedList 
{

	Node head;
	int size=0;

	class Node
	{	
		int data;
		Node next;
		Node prev;

		public Node()
		{
			super();
		}
	}


	void insert(int data) {

		Node temp = new Node();
		temp.data = data;
		size++;
		if(head==null)
		{
			temp.prev=head;
			head=temp;

		}
		else {

			Node last = head;
			while(last.next!=null) 
				last = last.next;

			last.next = temp;
			temp.prev = last;
		}
	}


	public int getSize() {
		return this.size;
	}

	void display() {
		System.out.println("Doubly Linked List...");

		Node temp = this.head;
		if(temp==null) {
			System.out.println("Linked list is empty");
			return;
		}

		while(temp!=null) {

			System.out.println(" "+temp.data);
			temp = temp.next;
		}
	}


	void deleteNode(Node head, Node del) 
	{ 

		// Base case 
		if (head == null || del == null) { 
			return; 
		} 

		// If node to be deleted is head node 
		if (head == del) { 
			head = del.next; 
		} 

		// Change next only if node to be deleted 
		// is NOT the last node 
		if (del.next != null) { 
			del.next.prev = del.prev; 
		} 

		// Change prev only if node to be deleted 
		// is NOT the first node 
		if (del.prev != null) { 
			del.prev.next = del.next; 
		} 

		this.head = head;
		// Finally, free the memory occupied by del 
		
		
		return; 
	} 




	public static void main(String[] arrgs)
	{
		DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
		//Inner Class members calling by creating Object of inner class using reference of outer class
		// DoublyLinkedList.Node inner= doublyLinkedList.new Node();
		doublyLinkedList.insert(10);
		
		System.out.println(doublyLinkedList.getSize());
		doublyLinkedList.insert(20);
		
		System.out.println(doublyLinkedList.getSize());
		doublyLinkedList.display();

		System.out.println(" Before deletion"+doublyLinkedList.getSize());
		doublyLinkedList.deleteNode(doublyLinkedList.head, doublyLinkedList.head);
		System.out.println("After deletion");
		doublyLinkedList.display();

	}

}
