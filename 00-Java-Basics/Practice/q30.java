class Animal {
    void eat() {
        System.out.println("Animal eats. ");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("Dog Barks. ");
    }

    void eat() {
        System.out.println("Dog eats. ");
    }
}

public class q30 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Animal x = new Dog();
        a.eat();
        d.eat();
        d.barks();
        x.eat();
    }
}
