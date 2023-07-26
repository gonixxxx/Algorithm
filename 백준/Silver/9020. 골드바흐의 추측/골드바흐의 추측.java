import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int M = 10000;
    static boolean[] arr = new boolean[M+1];

    static void makePrime() {
        arr[0] = arr[1] = true; // 소수가 아니면 true

        for (int i = 0; i <= Math.sqrt(M); i++) {
            if (!arr[i]) {
                for (int j =i+i; j <= M; j+=i) {
                    arr[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        makePrime();
        int T = Integer.parseInt(br.readLine());

        while(T > 0) {
            int n = Integer.parseInt(br.readLine());
            T--;

            int m = n / 2;
            while (true) {
                if (!arr[m] && !arr[n-m]) {
                    sb.append(m).append(" ").append(n-m).append("\n");
                    break;
                }
                m--;
            }
        }

        System.out.println(sb);
    }
}
