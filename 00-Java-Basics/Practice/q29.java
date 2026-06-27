public class q29 {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        q29 s1 = new q29();
        q29 s2 = new q29();
        s1.name = "Zayed";
        s2.name = "Raj";
        s1.age = 18;
        s2.age = 24;
        s1.display();
        s2.display();
    }
}