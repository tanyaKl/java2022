package by.itstep.vikvik.javalessons.lesson21.model.data;

public class Student {

    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 120;

    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private String name;
    private int age;
    private double mark;
    private boolean alive;

    public Student() {
        mark = 4;
    }

   public Student(String name, int age, double mark, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;
    }

    public Student(Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String toString() {
        return this.name + ": age = " + this.age + "; mark = " + this.mark
                + "; alive = " + alive;
    }
}
