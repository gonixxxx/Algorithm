class Solution {
    public long solution(int price, int money, int count) {
        int range = price * count;
        int i = 0;
        long sum = 0, answer = 0;
        
        while (i <= range) {
            sum += i;
            i += price;
        }
        
        answer = sum - money;
        if (answer < 0) answer = 0;

        return answer;
    }
}