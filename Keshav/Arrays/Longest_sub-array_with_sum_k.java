class Solution{
    public static int lenOfLongSubarr(int[] A, int N, int K) {
    int current = 0;
    int maxLength = 0;
    int start = 0;
    for (int end = 0; end < N; end++) {
        current += A[end];
        while (current > K && start <= end) {
            current -= A[start];
            start++;
        }
        if (current == K) {
            maxLength = Math.max(maxLength, end - start + 1);
        }
    }
    return maxLength;
}

}