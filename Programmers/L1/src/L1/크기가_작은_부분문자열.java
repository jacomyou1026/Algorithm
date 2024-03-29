package L1;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

        System.out.println(solution(t, p));
    }

    private static int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int result = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + len));
            if (diff <= num) result++;
        }
        return result;
    }
}
