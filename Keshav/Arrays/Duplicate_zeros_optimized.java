class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && i < n - 1) {
                int a = arr[i + 1];
                for (int j = i + 1; j < n - 1; j++) {
                    int b = a;
                    a = arr[j + 1];
                    arr[j + 1] = b;
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
