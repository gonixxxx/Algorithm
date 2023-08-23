import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static void hannoi(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start+" "+to+"\n");
            return;
        }
        hannoi(n-1, start, to, mid);
        sb.append(start+" "+to+"\n");
        hannoi(n-1, mid, start, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger cnt = new BigInteger("2");
        cnt = cnt.pow(n).subtract(BigInteger.ONE);
        sb.append(cnt).append("\n");

        if (n <= 20) {
            hannoi(n, 1, 2, 3);
        }
        System.out.print(sb);

    }
}