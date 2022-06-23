import java.util.AbstractList;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        AbstractList list = new ArrayList();
        list.add("gh");
        list.add(9);
        System.out.println(list);
    }
}