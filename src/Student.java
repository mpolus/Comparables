public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double age) {
        this.name = name;
        this.gpa = age;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return name + ": " + gpa;
    }
}