import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {
    private int[] stack;
    private int size;

    public Stack(int len) {
        this.stack = new int[len];
        this.size = -1;
    }

    public void push(int num) {
        stack[++size] = num;
    }

    public int pop() {
        if (empty() == 0) return stack[size--];
        return -1;
    }

    public int size() {
        return size + 1;
    }

    public int empty() {
        if (size == -1) return 1;
        return 0;
    }

    public int top() {
        if (empty() == 0) return stack[size];
        return -1;
    }


}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack(n);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String input[] = s.split(" ");

            switch (input[0]) {
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
            }

        }
    }
}
