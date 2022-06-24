package school;

public abstract class Teacher {
    String name = null;
    public Teacher(String name){
        this.name = name;
    }
    abstract void teach();
}
