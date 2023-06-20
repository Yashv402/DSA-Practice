package com.DSA;

public class LongestSubArraywithSumK {
    public static int lenOfLongSubarr (int A[], int N, int K) {

        int maxlenght=0;   //
        int i=0;  // i=0
        int j=0;  // j=1
        while(j<N){
            int sum=0;
            for(int k=i; k<j; k++){
                sum=sum+A[k];
            }
            if(sum<K){
                j++;
            }

            else if(sum>K){
                i++;
            }
            else{
                if(maxlenght<(j-i)){
                    maxlenght=j-i;
                }
            }
        }
        return maxlenght;


//        int maxlength=0;
//        int sum=0;
//        for(int i=0;i<N;i++){ // iterate to every element  i=2
//            for(int j=i; j<N; j++){  // select the end j=5  N=6
//                for(int k=i;k<=j;k++){  // for sum of all the elements  k=2, 3, 4
//                    sum=sum+A[k];
//                }
//                if(sum==K){
//                    if(maxlength<(j-i+1)){
//                        maxlength=(j-i+1);
//                    }
//                }
//                sum=0;
//            }
//        }
//        return maxlength;
    }
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int k=19;
        System.out.println(lenOfLongSubarr(arr,n, k));
    }
}
