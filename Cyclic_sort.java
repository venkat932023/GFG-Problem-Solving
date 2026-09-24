class Main {
    public static void main(String[] args) {
       int a[] =  {1,4,3,5,6,7,9,2,8};
        int n = a.length;
        int i=0; 
        while (i<n){
            if (i+1 == a[i]) i++;
            else{
                int idx = a[i]-1;
                int temp = a[i];
                a[i] = a[idx];
                a[idx] = temp;
            }
        }
        for (int j : a){
            System.out.print(j+" ");
        }
    }
}