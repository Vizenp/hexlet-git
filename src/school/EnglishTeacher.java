package school;

public class EnglishTeacher extends LanguageTeacher{
    public EnglishTeacher(String name) {
        super(name);
    }

    @Override
    void teach() {
        System.out.println(name + " is teaching english language");
    }
}
