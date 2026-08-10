public class Sort_an_array_descending_using_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,3,65,7,8,3,2,6};
        for(int i=0; i<arr.length-1; i++){
            boolean isSorted = true;
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted == true)
                break;
            
        }
        System.out.print(Arrays.toString(arr));
    }
}