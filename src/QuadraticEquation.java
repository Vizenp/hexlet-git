import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        solveEquation();
    }

    public static void solveEquation(){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        if(b % 2 != 0) solveUncountable(a, b, c);
        else solveCountable(a, b, c);
    }
    private static void solveUncountable(int a, int b, int c){
        int d = b * b - 4 * a * c;

        //ВЫВОД ДИСКРИМИНАНТА
        if(-4 * a * c < 0) System.out.printf("D = %d%d = %d \n", b * b, -4 * a * c, d);
        else System.out.printf("D = %d + %d = %d \n", b * b, -4 * a * c, d);

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
    private static void solveCountable(int a, int b, int c){
        int k = b/2;
        int d = k * k - a * c;

        //ВЫВОД ДИСКРИМИНАНТА
        if(-a * c < 0) System.out.printf("D = %d%d = %d \n", k * k, - a * c, d);
        else System.out.printf("D = %d + %d = %d \n", k * k, - a * c, d);

        //ВЫВОД РЕШЕНИЙ
        if(d > 0){
            System.out.printf("x1 = %d%d / %d = %s \n", -k, (int)-Math.sqrt(d), a, (-k - Math.sqrt(d)) / (a));
            System.out.printf("x2 = %d+%d / %d = %s \n", -k, (int)+Math.sqrt(d), a, (-k + Math.sqrt(d)) / (a));
        }
        else if(d == 0){
            System.out.printf("x1 = %d%d / %d = %s \n", -b, (int)-Math.sqrt(d), 2 * a, -b / (2 * a));
        }
        else {
            System.out.println("No solves");
        }
    }
}
