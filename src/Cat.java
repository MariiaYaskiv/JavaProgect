public class Cat extends Pet {
    Cat(String name) {
        super();
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }

}
