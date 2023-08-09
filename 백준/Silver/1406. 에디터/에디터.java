import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        String s = br.readLine();
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < s.length(); i++) {
            stack1.push(s.charAt(i));
        }

        for (int i = 0; i < m; i++) {
            String cmd = br.readLine();
            switch (cmd.charAt(0)) {
                case 'L':
                    if (!stack1.isEmpty()) stack2.push(stack1.pop());
                    break;
                case 'D':
                    if (!stack2.isEmpty()) stack1.push(stack2.pop());
                    break;
                case 'B':
                    if (!stack1.isEmpty()) stack1.pop();
                    break;
                case 'P':
                    stack1.push(cmd.charAt(2));
                    break;
            }
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            sb.append(stack2.pop());
        }

        System.out.print(sb);

    }
}
