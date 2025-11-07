/******************************************************************************
linked list:
  collection of nodes connected together through link.
  
basic terminology:
  first node is called the head and the last node is called as tail.
  
types of linked list:
 singly ll(sll),doubly(dll),cirular (cll)
 
types of cirular ll
 circular singly and circular doubly
                            
singly ll:is a type of linked list that is uni-directional(head to tail or vice versa)

 head-->sec-->tail

step1:basis structure of sll:

 class Node{
    int data;
    Node next;
 }

step2:how to create a Node
 syntax:Node nodename=new Node();

step3:how to assign a value
 syntax:nodename.data=val;

step4:how to link the nodes:
 currentnodename.next=nextnodename;
            head.next=sec;
             sec.next=tail;
            tail.next=null;



*******************************************************************************/
class Node{
    int data;
    Node next;
}
public class Main
{
	public static void main(String[] args) {
	    
	    Node head=new Node();
	    Node sec=new Node();
	     Node third=new Node();
	      Node tail=new Node();
	    
	    
	   head.data=10;
	   sec.data=20;
	   third.data=30;
	   tail.data=40;
	   
	   head.next=sec;
	   sec.next=third;
	   third.next=tail;
	   tail.next=null;
	   
	    
	    
		System.out.println(head.data);
		disp(head);
	}
	public static void disp(Node head){
    
    Node n=head;
    while(n!=null){
        System.out.print(n.data+"-->");
        n=n.next;
    }
    
    
    
    
}
}


