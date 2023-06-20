class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        int a=0;
        int b=0;
        for(int i:A){
            a+=i;
        }
        for(int i=1;i<=N;i++){
            b+=i;
        }
        return b-a;
    }
}