public class Cat<T> extends Animals<T> {
    public Cat(T name, T age) {
        super(name, age);
    }

    @Override
    public void doSwim() {
        System.out.println("Cats can swim!");
    }
}
