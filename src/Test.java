import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int count = 0;
        while (true) {
            int b = System.in.read();
            System.out.println(b);
            if (b == -1) break;
            count++;
        }
        System.out.println(count);
    }
}