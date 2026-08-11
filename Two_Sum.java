public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = {7,0,4,3,2,8,10};
        int t = 9;
        int i =0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]+arr[j] == t) {
                System.out.print(i+""+j);
                break;
            }
            else if (arr[i]+arr[j] < t ) i++;
            else j--;
        }
       
     
    
}
}
