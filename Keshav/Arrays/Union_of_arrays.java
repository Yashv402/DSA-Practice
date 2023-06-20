class Solution{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        // ArrayList<Integer> arr3 = new ArrayList<Integer>();
        
        // for (int i=0;i<n;i++){
        //     int a=arr1[i];
        //         if (arr3.contains(a)){
        //             continue;
        //         }
        //         arr3.add(a);
        //     }
            
        // for (int i=0;i<m;i++){
        //     int a=arr2[i];
        //         if (arr3.contains(a)){
        //             continue;
        //         }
        //         arr3.add(a);
        //     }
        //     Collections.sort(arr3);
        // return arr3;
        
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(!arr3.contains(arr1[i])){
                arr3.add(arr1[i]);
            }
        }
        
        for(int i=0;i<m;i++){
            if(!arr3.contains(arr2[i])){
                arr3.add(arr2[i]);
            }
        }
        Collections.sort(arr3);
        return arr3;
    }
}
