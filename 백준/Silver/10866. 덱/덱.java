import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dequeue {
    private int[] dequeue;
    private int front;
    private int back;
    private int size;

    Dequeue(int n) {
        this.dequeue = new int[n];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    void pushFront(int x) {
        dequeue[front] = x;
        front = (front - 1 + dequeue.length) % dequeue.length;
        size++;
    }

    void pushBack(int x) {
        back = (back + 1) % dequeue.length;
        dequeue[back] = x;
        size++;
    }

    int popFront() {
        if (empty() == 1) {
            return -1;
        }
        int val = dequeue[(front + 1) % dequeue.length];
        front = (front + 1) % dequeue.length;
        size--;
        return val;
    }

    int popBack() {
        if (empty() == 1) {
            return -1;
        }
        int val = dequeue[back];
        back = (back - 1 + dequeue.length) % dequeue.length;
        size--;
        return val;
    }

    int size() {
        return size;
    }

    int empty() {
        if (size() == 0) return 1;
        return 0;
    }

    int front() {
        if (empty() == 1) return -1;
        return dequeue[(front + 1) % dequeue.length];
    }

    int back() {
        if (empty() == 1) return -1;
        return dequeue[back];
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Dequeue dequeue = new Dequeue(n);
        while (n > 0) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push_front":
                    dequeue.pushFront(Integer.parseInt(s[1]));
                    break;
                case "push_back":
                    dequeue.pushBack(Integer.parseInt(s[1]));
                    break;
                case "pop_front":
                    sb.append(dequeue.popFront()).append("\n");
                    break;
                case "pop_back":
                    sb.append(dequeue.popBack()).append("\n");
                    break;
                case "size":
                    sb.append(dequeue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(dequeue.empty()).append("\n");
                    break;
                case "front":
                    sb.append(dequeue.front()).append("\n");
                    break;
                case "back":
                    sb.append(dequeue.back()).append("\n");
                    break;
            }
            n--;
        }

        System.out.print(sb);
    }
}