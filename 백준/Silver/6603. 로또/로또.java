import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] answer = new int[6];
    static boolean[] visited;
    static int[] arr;
    static void lotto(int depth, int num) {
        if (depth == 6) {
            for (int val:answer) {
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }

        for (int i = num; i < arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                answer[depth] = arr[i];
                lotto(depth+1, i+1);
                visited[i] = false;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());
            if (k == 0) break;

            visited = new boolean[k];
            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            lotto(0, 0);
            System.out.println();
        }


    }
}
