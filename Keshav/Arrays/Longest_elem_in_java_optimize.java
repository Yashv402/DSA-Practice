class Compute {
    
    public int largest(int arr[], int n)
    {
        int a=integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if(arr[i]>=a){
                a=arr[i];
            }
        }
        return a;

    }
}