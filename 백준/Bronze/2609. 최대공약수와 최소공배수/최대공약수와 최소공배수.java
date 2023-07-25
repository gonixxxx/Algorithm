import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 최대공약수
    static int gcd(int n, int m){
        if (m == 0) {
            return n;
        } else {
            return gcd(m ,n % m);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int res = gcd(n, m);
        System.out.println(res);
        System.out.println(n*m/res);
    }
}
