import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.BreakIterator;

class Queue {
    private int head;
    private int tail;
    private int[] queue;

    public Queue(int n) {
        this.head = -1;
        this.tail = -1;
        this.queue = new int[n];
    }

    void push(int x) {
        queue[++tail] = x;
    }

    int pop() {
        if (empty() == 1) {
            return -1;
        }
        return queue[++head];
    }

    int size() {
        return tail - head;
    }

    int empty() {
        if (head == tail) return 1;
        return 0;
    }

    int front() {
        if (empty() == 1) return -1;
        return queue[head+1];
    }

    int back() {
        if (empty() == 1) return -1;
        return queue[tail];
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue(n);
        while (n > 0) {
            String s = br.readLine();
            String[] cmd = s.split(" ");
            switch (cmd[0]) {
                case "push":
                    queue.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
            }
            n--;
        }

        System.out.print(sb);
    }
}
