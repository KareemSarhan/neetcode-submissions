class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        for (int i = digits.length-1;i>=0;i--)
        {
            if(digits[i] == 9){
                flag = true;
                digits[i]=0;
            }
            else 
            {digits[i]=digits[i]+1;
            return digits;
            }
        }
        int [] res = new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
