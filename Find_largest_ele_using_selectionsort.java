import java.util.*;

public class Find_largest_ele_using_selectionsort {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 4, 6, 2, 5, 6, 10, 67, 98, 5, 3 };
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
    }

}
