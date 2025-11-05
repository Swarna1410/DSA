/******************************************************************************
    insertion sort:
    insertion sort is the process of  inserting each and evry element from unsorted sub array to sorted sub array.
    
    algo:
    step1:assume zeroth index is a sorted subarray,rest all are unsorted subarray.
    step2:assume first index is a temp.
    step3: if the temp value less than the previous value,swap the value.
           else temp=temp.next;
    step4:repeat the step3 until a soretd array is found.
    
    
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int arr[]={40,30,10,20};
	    
	    for(int i=1;i<arr.length;i++){
	     while(i>0 && arr[i]<arr[i-1]){
	    int     temp=arr[i];
	         arr[i]=arr[i-1];
	         arr[i-1]=temp;
	         
	         i--;
	     }
	     
	     
	        
	    }
	    for(int ele:arr)
	    System.out.print(ele+" ");
	}
}
