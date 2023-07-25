import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static void primeFactor(int n) {
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            while((n % i) == 0) {
                n /= i;
                sb.append(i).append("\n");
            }
        }

        if (n != 1) {
            sb.append(n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        primeFactor(n);
        System.out.println(sb);
    }
}
