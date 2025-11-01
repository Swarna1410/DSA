/* searching technique
   searching is the process of finding the specific element from the collection of elements.
   types of searching:
       linear search and binary search
this is linear search:
*/

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int tar = 5, p = 0, index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                p = 1;
                index = i;
                break;
            }
        }

        if (p == 1)
            System.out.println("target " + tar + " found at index " + index);
        else
            System.out.println("target " + tar + " not found at index " + index);
    }
}
