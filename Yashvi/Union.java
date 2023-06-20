package com.newDSA;

import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here

        ArrayList<Integer> arr = new ArrayList<Integer>();  // 1, 2, 3, 4

        int i = 0;   //3
        int j = 0;   //3
        while (i < n && j < m) {  //false  //n=5, m=3
            if (arr1[i] == arr2[j]) {  // yes
                if (arr.contains(arr1[i]) == false) {   // yes
                    arr.add(arr1[i]);
                    j++;
                }
                i++;
            } else if (arr1[i] < arr2[j]) {
                if (arr.contains(arr1[i]) == false) {
                    arr.add(arr1[i]);
                }
                i++;

            } else {
                if (arr.contains(arr2[j]) == false) {
                    arr.add(arr2[j]);
                }
                j++;

            }
            // System.out.println(j);
            // System.out.println(i);
        }


        if (j == m) {  //yes
            for (int k = i; k < n; k++) {   // k=4,
                if (arr.contains(arr1[k]) == false) {  // yes
                    arr.add(arr1[k]);
                    // System.out.println(i);
                }
            }
        } else {
            for (int k = j; k < m; k++) {
                if (arr.contains(arr2[k]) == false) {
                    arr.add(arr2[k]);
                }
            }
        }

        return arr;
    }
}
