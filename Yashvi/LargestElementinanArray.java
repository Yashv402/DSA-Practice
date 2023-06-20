package com.newDSA;

public class LargestElementinanArray {
    public int largest(int arr[], int n)
    {
        int max=arr[0];
        for(int i=1; i<n; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
