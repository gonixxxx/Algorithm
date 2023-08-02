import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());

        while (k > 0) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) stack.pop();
            else stack.push(n);

            k--;
        }

        int sum = 0;
        for (Integer val:
             stack) {
            sum += val;
        }
        System.out.print(sum);

    }
}
