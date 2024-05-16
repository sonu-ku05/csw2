package part_1;

public class Q1 {
    public static void main(String[] args) {
        Student_1<Integer> a = new Student_1<>("sk", 94, 19);
        Student_1<String> b = new Student_1<>("shubham", "89", 20);
        System.out.println(a + "\n" + b);
    }
}

class Student_1<T> {
    String name;
    T roll;
    int age;

    Student_1(String name, T roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\t Roll No.: " + this.roll + "\t Age:" + this.age;
    }
}
/*
 * Output--
 * Name: sk Roll No.: 94 Age:40
 * Name: shubham Roll No.: 89 Age:20
 */