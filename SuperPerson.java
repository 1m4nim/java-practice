// public class SuperPerson extends Person {
//     boolean flying;

//     public void fly() {
//         this.flying = true;
//         System.out.println("とんだ");
//     }

//     public void land() {
//         this.flying = false;
//         System.out.println("着地");
//     }
// }

// public class SuperPerson extends Person {
//     boolean flying;

//     public void fly() {
//         this.flying = true;
//         System.out.println("とんだ");
//     }

//     public void land() {
//         this.flying = false;
//         System.out.println("着地");
//     }

//     public void run() {
//         System.out.println("撤退");
//     }
// }

public class SuperPerson extends Person {
    public void attack(Fungi f) {
        super.attack(f);
        if (this.flying) {
            super.attack(f);
        }
    }
}
