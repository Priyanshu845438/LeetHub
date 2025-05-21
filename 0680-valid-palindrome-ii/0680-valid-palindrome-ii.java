class Solution {
    public boolean validPalindrome(String s) {
        return isPalindromeWithDeletion(s, 0, s.length() - 1, false);
    }
    public boolean isPalindromeWithDeletion(String s, int left, int right, boolean deleted) {
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                if (deleted) {
                    return false;
                }
                return isPalindromeWithDeletion(s, left + 1, right, true) ||
                       isPalindromeWithDeletion(s, left, right - 1, true);
            }
            left++;
            right--;
        }
        return true;
    }
}

