/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(temp.indexOf(arr[j]) > -1) break;
                temp += arr[j]; 
            }
            if(result.length() < temp.length()) {
                result = temp;
            }
            temp = "";
        }

        return result.length();
    }
}*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++) {
            // set에 이미 문자가 있으면 없을 때까지 왼쪽을 줄여나감
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }

            // 현재 문자를 넣고 최대 길이 갱신
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - j + 1);
        }

        return maxLen;
    }
}