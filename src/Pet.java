public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        super();
        eyes = 2;
        System.out.println("I am a pet");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet runs and jumps");
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.run();
        pet.jump();
    }
}
