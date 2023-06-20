class Solution {
    int print2largest(int arr[], int n) {
        int a=-1;
        int b=a;
        for (int i=0;i<n;i++){
            if(a<arr[i]){
                b=a;
                a=arr[i];
            }
            else if(b<arr[i] && arr[i]!=a){
                b=arr[i];
            }
            
        }
        return b;
        
    }
}