import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static BigInteger n, m;
    static BigInteger one = BigInteger.ONE;
    
    static BigInteger factorial(BigInteger n, BigInteger r) {
        if (r.equals(m)) return n;
        return n.multiply(factorial(n.subtract(one), r.add(one)));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = new BigInteger(st.nextToken());
        m = new BigInteger(st.nextToken());

        if(n == m) System.out.print(1);

        System.out.print(factorial(n, one).divide(factorial(m, one)));
    }
}
