import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            q.add(i+1);
        }

        sb.append("<");
        while (n > 1) {
            for (int i = 0; i < k-1; i++) {
                q.addLast(q.pollFirst());
            }
            sb.append(q.pollFirst()).append(", ");
            n--;
        }

        sb.append(q.poll()).append(">");
        System.out.print(sb);
    }
}