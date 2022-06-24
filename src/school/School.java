package school;

public class School {
    int studentsCount = 0;
    private static final TeacherFactory teacherFactory = new TeacherFactory();
    public School(int studentsCount) {
        this.studentsCount = studentsCount;
    }

}
