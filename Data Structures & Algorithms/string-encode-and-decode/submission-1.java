class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Parse the length of the upcoming string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the string using the length
            i = j + 1;
            result.add(str.substring(i, i + length));
            
            // Move the index past the extracted string
            i += length;
        }
        
        return result;
    }
}