import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            LinkedList<Integer> list = new LinkedList<>();

            String p = br.readLine(); // 명령어
            int n = Integer.parseInt(br.readLine()); // 배열의 길이
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            for (int i = 0; i < n; i++) { // list
                list.add(Integer.parseInt(st.nextToken()));
            }

            AC(p, list);
        }

        System.out.print(sb);
    }

    static void AC(String p, LinkedList list) {
        boolean reverse = false; // reverse 여부
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == 'R') { // R
                reverse = !reverse;
            } else {        // D
                if (list.isEmpty()) {
                    sb.append("error\n");
                    return;
                } else {
                    if (reverse) {
                        list.pollLast();
                    } else {
                        list.pollFirst();
                    }
                }
            }
        }

        sb.append("[");
//            if (reverse) {
//                sb.append(list.pollLast());
//                while (!list.isEmpty()) {
//                    sb.append(",").append(list.pollLast());
//                }
//            } else {
//                sb.append(list.pollFirst());
//                while (!list.isEmpty()) {
//                    sb.append(",").append(list.pollFirst());
//                }
//            }
        while (!list.isEmpty()) {
            if (reverse) {
                sb.append(list.pollLast());
            } else {
                sb.append(list.pollFirst());
            }
            if (!list.isEmpty()) sb.append(",");
        }
        sb.append("]\n");
    }
}