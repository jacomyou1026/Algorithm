import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class _18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            solution(br.readLine(),queue,sb);
        }

        System.out.println(sb);

    }



    public static void solution(String br, Deque<Integer> queue, StringBuilder sb) {

        StringTokenizer st = new StringTokenizer(br);
        String s1 = st.nextToken();


        switch (s1) {
            case "push":
                queue.offer(Integer.parseInt(st.nextToken()));
                break;
            case "pop":
                if (!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                break;
            case "size":
                sb.append(queue.size()).append("\n");
                break;

            case "empty":
                if (!queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
                break;
            case "front":
                if (!queue.isEmpty()) {
                    sb.append(queue.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }

                break;
            case "back":

                if (!queue.isEmpty()) {
                    sb.append(queue.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                break;
        }


    }
}
