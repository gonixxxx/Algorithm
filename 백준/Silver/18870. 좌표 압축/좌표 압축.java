import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int val : sortedList) {
            if (!map.containsKey(val)) {
                map.put(val, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(list.get(i))).append(" ");
        }
        System.out.print(sb);
    }
}