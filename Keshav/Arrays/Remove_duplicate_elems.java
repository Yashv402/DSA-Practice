class Solution {
    int remove_duplicate(int A[],int N){
        int a=0;
        for(int i=1; i<N; i++){
            if(A[a]!=A[i]){
                A[a+1]=A[i];
                a++;
            }
        }
        return a+1;
    }
}