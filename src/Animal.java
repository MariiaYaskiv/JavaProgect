public class Animal {
    int eyes;

    Animal() {
        System.out.println("I am an animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.drink();
    }
}
