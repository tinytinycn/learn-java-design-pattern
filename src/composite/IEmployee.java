package composite;

import java.util.List;

/**
 * Component组件抽象类
 */
public interface IEmployee {
    void add(IEmployee iEmployee);

    void remove(IEmployee iEmployee);

    IEmployee getEmployee(int i);

}
