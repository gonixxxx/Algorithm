import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n, m, cnt;
    static int maxNum = 1000000;
    static boolean[] primeArr = new boolean[maxNum];

    static void makePrime() {
        for (int i = 2; i <= Math.sqrt(maxNum); i++) {
            if (!primeArr[i]) {
                for (int j = i*i; j < maxNum; j+=i) {
                    primeArr[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        makePrime();
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            cnt = 0;
            m = n / 2;
            for (int i = 2; i <= m; i++) {
                if (!primeArr[i] && !primeArr[n-i]) {
                    cnt += 1;
                    System.out.println(n+" = "+i+" + "+(n-i));
                    break;
                }
            }

            if (cnt == 0) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
