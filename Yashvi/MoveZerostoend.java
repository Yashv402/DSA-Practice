package com.newDSA;

public class MoveZerostoend {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
    }
}
