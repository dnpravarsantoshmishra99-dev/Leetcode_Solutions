 class Solution {
    public int uniquePaths(int m, int n) {
        int a = m + n - 2;  // (m+n-2) = total moves in all combinations
        int b = Math.min(m,n) - 1;  // both (m-1) & (n-1) work , but for the sake of better time, we use min

        long result = nCr(a,b);
        return (int)result;
    }
    long nCr(int n, int r) {
        // base case 1
        if(r == 0) return 1;
        // base case 2
        if(r == 1) return (long) n;

        // recursive formula 
        // nCr = nCr-1 * (n-r+1)/r

        return nCr(n, r-1) * (n - r + 1) / r;
    }
}