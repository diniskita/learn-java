/* Overloading methods and Object Comparison */
public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student(" + this.name + ")";
    }

    public boolean equals(Student other) {
        /* return this.name.equals(other.name); */
        if (this.name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}

