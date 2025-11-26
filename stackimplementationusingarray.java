/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Stack o=new Stack(3);
		o.push(10);
		o.push(20);
		o.push(30);
		o.push(40);
		o.dis();
		o.peek();
		o.pop();
	}
}
class Stack{
    int arr[];
    int top;
 Stack(int size)
 {
     arr=new int[size];top=-1;
     
 }
 public void push(int data){
     if(top==arr.length-1)
     System.out.println("overflow");
     else{
         
         arr[++top]=data;
         System.out.println("pushed");
     }
 }
 
 public void dis(){
     if(top==-1){
         System.out.println("stack empty");
     }
     for(int i=0;i<=top;i++){
         System.out.println(arr[i]);
     }
     
    
 }
 
 
 public void peek()
 {
     if(top==-1)
     System.out.println("stack is empty");
     else
     System.out.println(arr[top]);
 }
 
 public void pop()
 {
     if(top==-1)
     {
         System.out.println("stack underflow");
     }
     else
     System.out.println("element popped is "+arr[top--]);
     
 }
 
 
 
 
 
 
 
 
 
 
 
}
