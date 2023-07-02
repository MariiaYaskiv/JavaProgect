public class Dog extends Pet {
    Dog(String name) {
        super();
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.play();
    }
}
