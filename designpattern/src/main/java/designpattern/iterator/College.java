package designpattern.iterator;

import java.util.Iterator;

public interface College {

    public String getName();

    public void addDepartment(String name);

    public Iterator createIterator();
}
