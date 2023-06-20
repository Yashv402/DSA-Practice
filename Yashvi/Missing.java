package com.newDSA;

public class Missing {
    public static int missingNumber(int A[], int N)
    {
        // Your code goes here
        int j=0;
        for(int i=0; i<N; i++){
            j=j+A[i];
        }
        int sum=0;
        for(int i=1; i<=N;i++){
            sum = sum +i;
        }
        //  int sum= N*(N+1)/2;

        int number= sum-j;
        return number;
    }
}
