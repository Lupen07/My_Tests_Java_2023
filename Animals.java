public class Animals<T> {
    private T name;
    private T age;

    public Animals(T name, T age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public void doSwim() {
        System.out.println("Swimming...");
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
