package composite;

public class Client {
    public void test() {
        // 一级
        final Employee ceo = new Employee("John", "CEO", 30000);
        // 二级
        Employee headSales = new Employee("Robert", "Head sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
        // 三级员工
        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
        // 添加到管理树状结构中
        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);
    }
}
