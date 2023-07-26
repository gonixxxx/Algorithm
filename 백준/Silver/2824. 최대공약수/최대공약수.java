import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BigInteger gcd(BigInteger a, BigInteger b) {
        if(b.equals(BigInteger.ZERO)) {
            return a;
        }

        return gcd(b, a.remainder(b));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        
        // n
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            a = a.multiply(new BigInteger(st.nextToken()));
        }

        // m
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            b = b.multiply(new BigInteger(st.nextToken()));
        }

        BigInteger res = gcd(a, b);

        String s = String.valueOf(res);

        if(s.length() > 9) {
            System.out.print(s.substring(s.length()-9, s.length()));
        } else {
            System.out.print(s);
        }

    }
}
