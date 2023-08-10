import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<int[]> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 6 9 5 7 4
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (stack.peek()[0] < m) stack.pop();
                else {
                    System.out.print(stack.peek()[1]+" ");
                    break;
                }
            }
            if (stack.isEmpty()) System.out.print("0 ");
            stack.push(new int[] {m, i+1});
        }

    }
}
