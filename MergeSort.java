import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] array = {3, 92, 99991, 0, 6, 10, 8, 11, -1};

    MergeSort.mergesort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergesort(int[] A, int p, int r){
        if (p < r) {         //base case
            int q = Math.floorDiv(p + r , 2);     //divide to find the mid point
            mergesort(A, p, q);      //recursively call mergesort on the left side
            mergesort(A, q + 1, r); //recursively call mergesort on the right side
            merge(A, p, q, r);      //merge
        }
        else {

        }
    }

    public static void merge(int[] A, int p, int q, int r){
       //put output in auxiliary arrays to keep the values of the arrays
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        L[L.length - 1] = (int) Double.POSITIVE_INFINITY;
        R[R.length - 1] = (int) Double.POSITIVE_INFINITY;

        for (int i = 0; i < n1 ; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < n2 ; j++) {
            R[j] = A[q + 1 + j ];
        }

        int i = 0;
        int j = 0;

        for (int k = p; k <= r ; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
        }
    }
}
