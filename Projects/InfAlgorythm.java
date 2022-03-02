import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InfAlgorythm {
	
	public static void main(String[] args) {
		algorithmPage148(3);
	}
	
	public static int algorithm201(int x, int y) {
		while(x!=y) {
			if(x>y) {
				x = x - y;
			}
			else {
				y = y - x;
			}
		}
		return x; //написал Калинский Виталий. упражнение 201
	}
  public static void algorithmPage148(int times){
    String[] words = new String[times];

    //заполняем список словами
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < times; i++) {
      words[i] = scanner.nextLine();
    }

    //создаём список возможных случаев
    String[][] cases = new String[Factorial.getFactorial(times)][times];
    for (int i = 0; i < cases.length; i++) {
      for (int j = 0; j < times; j++) {
        cases[i][j] = words[j] ;
      }     
    }
    System.out.println(Arrays.deepToString(cases));
  }
}
