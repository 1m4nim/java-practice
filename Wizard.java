public class Wizard {
    String name;
    int hp;

    public void heal(Person p) {
        p.hp += 10;
        System.out.println(p.name + "のHPを10回復した");
    }
}
