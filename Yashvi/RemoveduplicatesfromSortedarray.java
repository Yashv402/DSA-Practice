package com.newDSA;

public class RemoveduplicatesfromSortedarray {
    int remove_duplicate(int A[],int N){
        // code here

        int pointer=0;
        for(int i=1; i<N; i++){
            if(A[pointer]!=A[i]){
                pointer++;
                A[pointer]=A[i];
            }
        }
        return pointer+1;
    }
}
