package designpattern.composite;

/**
 * 组合模式
 * 将同一抽象的实现类组合起来
 */
public class CompositePattern {

    public static void main(String[] args) {
        Department department1 = new Department("职工部门");
        Department department2 = new Department("财务部门");
        College college1 = new College("广州校区");
        college1.add(department1);
        college1.add(department2);
        Department department3 = new Department("社团部门");
        College college2 = new College("深圳校区");
        college2.add(department3);
        University university = new University("社会大学");
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
