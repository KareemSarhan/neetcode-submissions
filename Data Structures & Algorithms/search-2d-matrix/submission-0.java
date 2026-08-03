class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=matrix[0].length*matrix.length-1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            int midA = mid/matrix[0].length;
            int mid2= mid - midA *matrix[0].length; 
            if(target==matrix[midA][mid2]) return true;
            else if(target<matrix[midA][mid2]) r = mid-1;
            else if(target>matrix[midA][mid2]) l = mid+1;
        }
        return false;
    }
}
