public class SuperPerson extends Person {
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println("とんだ");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地");
    }
}
