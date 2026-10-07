class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String id : details) {
            int age = Integer.parseInt(id.substring(11, 13));
            res += age > 60 ? 1 : 0;
        }
        return res;
    }
}