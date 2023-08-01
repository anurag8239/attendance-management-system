import java.util.Arrays;

public class D {
    public static void main(String args[]) {
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = 1;
        int arr1[] = Arrays.copyOf(arr, 10);
        System.out.println(arr.length);
        arr = arr1;
        System.out.println(arr.length);
        for (int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }
}
