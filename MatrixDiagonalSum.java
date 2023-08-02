class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=mat[i][i];
            if(i!=n-i-1)
            {
                s+=mat[i][n-i-1];
            }
        }
        return s;
    }
}
