package com.newDSA;

public class SecondLargestElementArray {
    int print2largest(int arr[], int n) {

        int max= -1;  //12
        int sec_max= Integer.MIN_VALUE;  //12
        for(int i=0; i< n; i++){  //i=4  arr[4]=34
            if(arr[i]>max){  // no
                sec_max = max;
                max= arr[i];  //  max=35
            }
            else if(arr[i] > sec_max && max!= arr[i]){  //  yes
                sec_max= arr[i];  // sec_max= 34
            }
        }
        return sec_max;

    }
}
