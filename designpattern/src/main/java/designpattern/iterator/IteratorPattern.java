package designpattern.iterator;

import java.util.Collections;

/**
 * 迭代器模式
 * 实现Iterator接口，将数组封装成迭代器
 */
public class IteratorPattern {

    public static void main(String[] args) {
        College college = new ComputerCollege();
        college.addDepartment("学生会部门");
        college.addDepartment("食堂部门");
        OutputImpl output = new OutputImpl(Collections.singletonList(college));
        output.printColleges();
    }
}
