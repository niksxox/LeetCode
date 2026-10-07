class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> candy = new HashSet<>();
        for(int i = 0; i<candyType.length; i++){
            candy.add(candyType[i]);
        } 
        return Math.min(candy.size(), candyType.length/2);
    }
}