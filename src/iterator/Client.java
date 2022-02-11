package iterator;

public class Client {
    void test() {
        // 创建一个集合类
        NameRepo nameRepo = new NameRepo();
        // 获取集合类迭代器
        Iterator iterator = nameRepo.getIterator();
        // 开始通过迭代器进行迭代获取内部细节
        while (iterator.hasNext()) {
            System.out.println("获取：" + iterator.next().toString());
        }
    }
}
