/*
Q12. Write a java program to create a class called "ArrayDemo" and overload "arrayFunc()" function.
void arrayFunc(int[], int) - To find all pairs of elements in an array whose sum is equal to a given number
void arrayFunc(int A[], int P, int B[], int Q) - Given the sorted arrays A and B of size P and Q. Overload method "arrayFunc()" to merge elements of A with B maintaining the relative order ie fill A with first of smallest elements and fill B with remaining elements.
*/
import java.util.*;
public class ArrayDemo {
    void arrayFunc(int arr[], int sum) 
    {
        Map<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
        for(int i=0; i<arr.length; i++) {
            mp.put(arr[i], true);
        }
        for(int i=0; i<arr.length; i++) {
            if(mp.containsKey(sum - arr[i]) == true) {
                System.out.println(arr[i] + " " + (sum - arr[i]));
            }
        }
        System.out.println();
    }
    void arrayFunc(int A[], int P, int B[], int Q)
    {
        int merged[] = new int[P + Q];
        int i = 0, j = 0, k = 0;
        while(i < P && j < Q) {
            if(A[i] < B[j])
            merged[k++] = A[i++];
            else
            merged[k++] = B[j++];
        }
        while(i < P)
        merged[k++] = A[i++];
        while(j < Q)
        merged[k++] = B[j++];

        k = 0;
        for(i=0; i<P; i++) {
            A[i] = merged[k++];
        }
        for(i=0; i<Q; i++) {
            B[i] = merged[k++];
        }

        System.out.print("Sorted Arrays:" +  "\n" + "A[]: ");
        for(i=0; i<P; i++) 
            System.out.print(A[i] + " ");
        System.out.println();
        System.out.print("B[]: ");
        for(i=0; i<Q; i++)
            System.out.print(B[i] + " ");
        System.out.println();        
    }
    public static void main(String args[])
    {
        ArrayDemo obj = new ArrayDemo();
        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        int sum = 10;
        int A[] = {1, 5, 6, 7, 8, 10};
        int B[] = {2, 4, 9};

        obj.arrayFunc(arr, sum);
        obj.arrayFunc(A, 6, B, 3);
    }
}

/*
OUTPUT:
4 6
6 4
5 5
-10 20
5 5
20 -10

Sorted Arrays:
A[]: 1 2 4 5 6 7
B[]: 8 9 10 
*/