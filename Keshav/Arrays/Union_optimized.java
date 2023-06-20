class Solution{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        int i = 0, j = 0;
        ArrayList<Integer > arr3=new ArrayList<>(); 
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]){
                if (arr3.size() == 0 || arr3.get(arr3.size()-1) != arr1[i]){
                    arr3.add(arr1[i]);
                    i++;
                }
            }
            else{
                if (arr3.size() == 0 || arr3.get(arr3.size()-1) != arr2[j]){
                    arr3.add(arr2[j]);
                    j++;
                }     
            }
        }
        while (i < n){
            if (arr3.get(arr3.size()-1) != arr1[i]){
                arr3.add(arr1[i]);
                i++;
            }
        }
        while (j < m) {
            if (arr3.get(arr3.size()-1) != arr2[j]){
                arr3.add(arr2[j]);
                j++;
            }
        }
        return arr3;  

    }
}