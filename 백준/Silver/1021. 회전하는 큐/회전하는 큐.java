import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int half;
        int[] arr = new int[m];

        for (int i = 0; i < n; i++) {
            deque.add(i+1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int idx = deque.indexOf(arr[i]);

            if (deque.size() % 2 == 0) {
                half = deque.size() / 2 - 1;
            }
            else {
                half = deque.size() / 2;
            }

            if (idx > half) {
                while (deque.getFirst() != arr[i]) {
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            } else {
                while (deque.getFirst() != arr[i]) {
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            }
            deque.pollFirst();
        }

        System.out.print(cnt);
    }
}