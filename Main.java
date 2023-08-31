
public class Main {
    public static void main(String[] args) {
        Animals<String> cat = new Cat<>("Whiskers", "3");
        Animals<String> dog = new Dog<>("Rex", "5");

        System.out.println("Cat: " + cat);
        cat.doSwim();

        System.out.println("Dog: " + dog);
        dog.doSwim();
    }
}