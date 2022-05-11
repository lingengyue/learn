package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    private final List<OrganizationComponent> organizationComponents = new ArrayList<>();
    public College(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        organizationComponents.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        organizationComponents.remove(component);
    }

    @Override
    public void print() {
        System.out.println("+------------" + getName() + "---------------");
        for (OrganizationComponent component : organizationComponents) {
            component.print();
        }
    }
}
