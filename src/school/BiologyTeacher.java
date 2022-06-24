package school;

public class BiologyTeacher extends Teacher{

    public BiologyTeacher(String name) {
        super(name);
    }

    @Override
    void teach() {
        System.out.println(name + " is teaching biology");
    }
}
