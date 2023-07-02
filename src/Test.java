public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        System.out.println("Number of paws: " + dog.paw);
        cat.sleep();
    }
}
