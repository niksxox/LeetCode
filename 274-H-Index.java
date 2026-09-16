class Solution {
    public int hIndex(int[] citations) {

        int answer = 0;

        for (int h = 1; h <= citations.length; h++) {

            int count = 0;

            for (int i = 0; i < citations.length; i++) {

                if (citations[i] >= h) {
                    count++;
                }
            }

            if (count >= h) {
                answer = h;
            }
        }

        return answer;
    }
}