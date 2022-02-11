package iterator;

/**
 * 具体的集合类
 */
public class NameRepo implements ContainerAggregate {

    // 内部元素细节
    private String names[] = {"john", "tiny", "bob", "marry"};

    // 获取迭代器
    @Override
    public Iterator getIterator() {
        return null;
    }

    // 内部类-具体迭代器，可以访问集合类内部细节names
    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
