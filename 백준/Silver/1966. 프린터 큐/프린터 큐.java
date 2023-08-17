import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                q.add(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            while (true) {
                int[] first = q.pollFirst();
                boolean isMax = true;
                for (int i = 0; i < q.size(); i++) {
                    if (first[1] < q.get(i)[1]) {
                        isMax = false;
                        break;
                    }
                }

                if (isMax) {
                    cnt++;
                    if (first[0] == m) break;
                } else {
                    q.add(first);
                }
            }
            sb.append(cnt).append("\n");
            t--;
        }

        System.out.print(sb);
    }
}