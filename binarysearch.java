//binary search log(n) complexity
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int s=0,e=arr.length-1,tar=30;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(tar==arr[mid]){
            System.out.println(mid);
            break;}
            else if(tar>arr[mid])
            s=mid+1;
            else if(tar<arr[mid])
            e=mid-1;
        }
        
    }
}

