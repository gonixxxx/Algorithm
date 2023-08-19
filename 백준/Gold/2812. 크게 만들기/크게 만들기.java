import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String arr = br.readLine();
        int cnt = k;

        for (int i = 0; i < n; i++) {
            int num = arr.charAt(i) - '0'; // 문자 -> 숫자
            while (!stack.isEmpty() && cnt > 0 && num > stack.peek()) {
                stack.pop();
                cnt--;
            }
            stack.push(num);
        }

        while (cnt > 0) {
            stack.pop();
            cnt--;
        }

        for (int val : stack) {
            sb.append(val);
        }
        System.out.print(sb);
    }
}