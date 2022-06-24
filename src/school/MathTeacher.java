package school;

public class MathTeacher extends Teacher{

    public MathTeacher(String name) {
        super(name);
    }

    @Override
    void teach() {
        System.out.println(name + " is teaching math");
    }
}
