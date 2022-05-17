package designpattern.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int num = 0;

    public ComputerCollege() {
        departments = new Department[5];
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addDepartment(String name) {
        departments[num++] = new Department(name);
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
