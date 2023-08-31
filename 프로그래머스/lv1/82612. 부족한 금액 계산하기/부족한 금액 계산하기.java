class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 0; i <= count * price; i+= price) {
            answer -= i;
        }
        
        return answer < 0 ? -answer : 0;
    }
}