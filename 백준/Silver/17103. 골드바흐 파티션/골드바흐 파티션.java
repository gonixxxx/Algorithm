import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int maxNum = 1000000;
    static boolean[] arr = new boolean[maxNum];

    static void makePrime() {
        for (int i = 2; i <= Math.sqrt(maxNum); i++) {
            if (!arr[i]) {
                for (int j = i+i; j < maxNum; j+=i) {
                    arr[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        makePrime();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int m = n / 2;

            while (m > 1) {
                if (!arr[m] && !arr[n-m]) {
                    cnt++;
                }
                m--;
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);

    }
}
