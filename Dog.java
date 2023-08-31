public class Dog <T> extends Animals<T> {
    public Dog(T name, T age) {
        super(name, age);
    }

    @Override
    public void doSwim() {
        System.out.println("Dogs can swim!");
    }
}
