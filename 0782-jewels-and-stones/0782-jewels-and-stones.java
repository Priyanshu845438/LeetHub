class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for(int i = 0; i < stones.length(); i++){
            char stone = stones.charAt(i);

            for (int j = 0; j < jewels.length(); j++) {
                if (stone == jewels.charAt(j)) {
                    count++;
                    break;
            }
        }
    }
    return count;
}
}