import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        solveEquration(a, b, c);
    }

    public static void solveEquration(int a, int b, int c){
        int d = b * b - 4 * a * c;
        //if (b % 2 != 0) d = b * b - 4 * a * c;
        //else d = (b / 2) * (b / 2) - a * c;

        //ВЫВОД ДИСКРИМИНАНТА
        if(-4 * a * c < 0) System.out.printf("D = %d%d = %d \n", b * b, -4 * a * c, b * b - 4 * a * c);
        else System.out.printf("D = %d + %d = %d \n", b * b, -4 * a * c, b * b - 4 * a * c);

        //ВЫВОД РЕШЕНИЙ
        if(d > 0){
            System.out.printf("x1 = %d%d / %d = %s \n", -b, (int)-Math.sqrt(d), 2 * a, (-b - Math.sqrt(d)) / (2 * a));
            System.out.printf("x2 = %d+%d / %d = %s \n", -b, (int)+Math.sqrt(d), 2 * a, (-b + Math.sqrt(d)) / (2 * a));
        }
        else if(d == 0){
            System.out.printf("x1 = %d%d / %d = %s \n", -b, (int)-Math.sqrt(d), 2 * a, -b / (2 * a));
        }
        else {
            System.out.println("No solves");
        }
    }
}
