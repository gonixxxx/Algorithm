import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;
        long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
        
        HashSet<long[]> set = new HashSet<>();
        
        for (int i = 0; i < line.length - 1; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];
                
                // 교점 구하기
                double adbc = (a*d - b*c);
                if (adbc == 0) continue;
                
                double bfed = (b*f - e*d);
                double ecaf = (e*c - a*f);
                
                // 정수인 교점만 저장
                if (bfed % adbc != 0 || ecaf % adbc != 0) continue;
                
                long x = (long) (bfed / adbc);
                long y = (long) (ecaf / adbc);
                set.add(new long[] {x, y});
                
                // 좌표배열을 만들기 위한 x,y의 최대/최소값
                maxX = Math.max(maxX, x);
                minX = Math.min(minX, x);
                maxY = Math.max(maxY, y);
                minY = Math.min(minY, y);
            }
        }
        
        // 좌표 배열 생성
        int row = (int) (maxY - minY + 1);
        int column = (int) (maxX - minX + 1);
        boolean[][] arr = new boolean[row][column];
        
        // 교점 위치 => true
        for (long[] val :  set) {
            arr[(int) (maxY - val[1])][(int) (val[0] - minX)] = true;
        }
        
        // true => 별찍기
        String[] answer = new String[row];
        int i = 0;
        for (boolean[] b : arr) {
            StringBuilder sb = new StringBuilder();
            for (boolean val : b) {
                if (val) sb.append("*");
                else sb.append(".");
            }
            answer[i++] = sb.toString();
        }
        
        return answer;
    }
}