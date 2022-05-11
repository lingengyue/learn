package designpattern.composite;

public class Department extends OrganizationComponent {
    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("++-----------" + getName() + "---------------");
    }
}
