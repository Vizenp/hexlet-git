package school;

public class RussianTeacher extends LanguageTeacher{
    public RussianTeacher(String name) {
        super(name);
    }

    @Override
    void teach() {
        System.out.println(name + " is teaching russian language");
    }
}
