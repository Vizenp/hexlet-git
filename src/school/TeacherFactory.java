package school;

public class TeacherFactory {
    public Teacher createTeacher(String type, String name){
        switch (type.toLowerCase()){
            case("math"):
                return new MathTeacher(name);
            case ("russian"):
                return new RussianTeacher(name);
            case ("biology"):
                return new BiologyTeacher(name);
            case ("english"):
                return new EnglishTeacher(name);
        }
        return null;
    }
}
