package composite;

import java.util.List;

/**
 * ConcreteComponent组建具体类
 */
public class Employee implements IEmployee {
    private String name;
    // 部门
    private String dept;
    // 工资
    private int salary;
    // 员工 list
    private List<Employee> subordinates;


    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public void add(IEmployee iEmployee) {
        subordinates.add((Employee) iEmployee);
    }

    @Override
    public void remove(IEmployee iEmployee) {
        subordinates.remove(iEmployee);
    }

    @Override
    public IEmployee getEmployee(int i) {
        return subordinates.get(i);
    }
}
