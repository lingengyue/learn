package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    private List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printColleges() {
        for (College college : colleges) {
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }

    }
}
