/******************************************************************************

                            implementation of ssl
                            insertion:
                            
                            
                            public void insert(int data)
{
    Node hello=new Node(data);
    if(head==null){
        head=hello;
        tail=hello;
    }
    else{
        tail.next=hello;
        tail=hello;
    }
}
                            
                            
                            
                            
                            ,deletion,searching
                            
                            
                            
searching:

void search(int val){
    
    int p=0;
    Node n=head;
    
    while(n!=null){
        if(n.data==val){
            p=1;break;
        }n=n.next;
    }
       if(p==1) 
       System.out.println("found");
       else
    System.out.println("not found");
    }
    
    
    
    




















*******************************************************************************/
class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;}
}
class SLL{
    Node head;
    Node tail;
    SLL(){
        head=null;
        tail=null;
    }

public void insert(int data)
{
    Node hello=new Node(data);
    if(head==null){
        head=hello;
        tail=hello;
    }
    else{
        tail.next=hello;
        tail=hello;
    }
}


void search(int val){
    
    int p=0;
    Node n=head;
    
    while(n!=null){
        if(n.data==val){
            p=1;break;
        }n=n.next;
    }
       if(p==1) 
       System.out.println("found");
       else
    System.out.println("not found");
    }
    
    
    
    public void del(int tar){
        if(head.data==tar){
            head=head.next;
        }
        else{
            Node n=head;
            while(n.next!=null&& n.next.data!=tar){
                
                n=n.next;
                
                
                
            }
            n.next=n.next.next;
        }
    }
    
    









    void disp(){
      Node n=head;
      while(n!=null){
      System.out.print(n.data+" ->");
      n=n.next;
      
      }
      
   } 
}


public class Main
{
	public static void main(String[] args) {
	    
	    SLL o=new SLL();
	    o.insert(10); o.insert(20); o.insert(30); o.insert(40);
	    o.del(40);
	    o.disp();
	    o.search(70);
		
	}
}
