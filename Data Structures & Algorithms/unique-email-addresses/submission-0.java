class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<>();
        for(String s : emails)
        {
            String local = s.substring(0,s.indexOf("@"));
            String dom = s.substring(s.indexOf("@"));
            local = local.substring(0,local.indexOf("+")>0?local.indexOf("+"):local.length());
            local = local.replace(".", "");
            hs.add(local+"@"+dom);
        }
        return hs.size();
    }
}