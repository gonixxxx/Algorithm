import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int val = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            val = gcd(val, arr[i] - arr[i-1]);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) {
                res.add(i);
                if (val / i != i) {
                    res.add(val / i);
                }
            }
        }
        Collections.sort(res);
        for (int x : res) {
            System.out.print(x+" ");
        }
        System.out.print(val);
    }
}