class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j += 1;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (j < n) {
                arr[j] = arr[i];
            }
            j--;
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = arr[i];
                }
                j--;
            }
        }
    }
}