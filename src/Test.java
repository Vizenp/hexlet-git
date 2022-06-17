import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class Test {
    public static void main(String[] args) {
        
    }
}

abstract class Person {
    int age;
    String name;
    boolean isMale;

    public Person(String name, int age, boolean isMale) {

    }

    int getAge() {
        return age;
    }

    void sleep() {
        System.out.println(this.name + " спит");
    }

    void eat() {
        System.out.println(this.name + " ест");
    }

    void haveASex(Person p) throws InPeriod {

    }
}

class Male extends Person {

    public Male(String name, int age, boolean isMale) {
        super(name, age, isMale);

    }

}

class Female extends Person {
    boolean InPeriod;

    public Female(String name, int age, boolean isMale) {
        super(name, age, isMale);
        // TODO Auto-generated constructor stub
    }

}

class InPeriod extends Exception {
    public InPeriod() {
        super("У неё месяки... не получится");
    }
}