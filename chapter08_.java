public class chapter08_ {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "1m4nim";
        p.hp = 100;
        System.out.println(p.name + "を召喚");
        p.sit(5);
        p.slip();
        p.sit(25);
        p.run();

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 40;
        m2.suffix = 'B';

        p.slip();
        m1.run();
        m2.run();
        p.run();
    }
}
