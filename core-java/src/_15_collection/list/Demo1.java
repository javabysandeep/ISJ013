package _15_collection.list;

public class Demo1 {
    public static void main(String[] args) {

        interface  Iterator{
            public abstract boolean hasNext();
            public abstract Object next();
        }

        interface Iterable {
            public abstract Iterator iterator();
        }

        class Itr implements Iterator{
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        }

        class IterableImpl implements Iterable{
            @Override
            public Iterator iterator() {
                return new Itr();
            }
        }

        IterableImpl impl = new IterableImpl();
        Iterator iterator = impl.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
