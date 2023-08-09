import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            if (m > max) {
                for (int j = max+1; j <= m; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
                max = m;
            } else if (stack.peek() == m) {
                stack.pop();
                sb.append("-").append("\n");
            }
        }

        if (stack.isEmpty()) {
            System.out.print(sb);
        } else {
            System.out.print("NO");
        }
    }
}
