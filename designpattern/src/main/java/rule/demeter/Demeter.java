package rule.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特原则（最少知道原则）
 * 一个类应该对其他类保持最少的了解（通过封装），方法中不应该使用到没有直接关联（如方法入参/出参/成员变量）的类
 */
public class Demeter {

    public static void main(String[] args) {
        College college = new College();
        college.addStudent(new Student("张三"));
        college.addStudent(new Student("李四"));
        School school = new School();
        school.addCollege(college);
        school.printStudents();
    }
}

class School {
    List<College> collegeList = new ArrayList<>();

    void addCollege(College college) {
        collegeList.add(college);
    }

    void printStudents() {
        for (College college : collegeList) {
            // 直接调用college的print方法，而不是拿studentList出来print
            college.printStudents();
        }
    }
}

class College {
    List<Student> studentList = new ArrayList<>();
    void addStudent(Student student) {
        studentList.add(student);
    }

    void printStudents() {
        for (Student student : studentList) {
            student.printName();
        }
    }
}

class Student {
    private String name;
    Student(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(name);
    }
}
