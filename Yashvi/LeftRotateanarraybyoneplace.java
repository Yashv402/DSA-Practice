package com.newDSA;

public class LeftRotateanarraybyoneplace {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        d=d%n;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]= temp;
        }
        for(int j=0; j<(n-d)/2;j++){
            int temp = arr[j];
            arr[j]= arr[n-d-1-j];
            arr[n-d-j-1]=temp;
        }
        for(int i=0;i<d/2;i++){
            int temp = arr[n-d+i];
            arr[n-d+i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
}
