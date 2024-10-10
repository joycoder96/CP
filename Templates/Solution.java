import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        var in = new FastReader(System.in);
        var out = new PrintWriter(System.out);

        // Write your solution here.

        out.close();
    }

    static class FastReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() { return Integer.parseInt(next()); }
    }
}
