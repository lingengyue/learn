package designpattern.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int pos = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return departments.length > pos && departments[pos] != null;
    }

    @Override
    public Object next() {
        return departments[pos++];
    }
}
