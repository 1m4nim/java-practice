// public class chapter05 {
//     public static void main(String[] args) {
//         hello();
//     }

//     public static void hello() {
//         System.out.println("Hello!");
//     }
// }

// public class chapter05 {
//     public static void main(String[] args) {
//         hello("1m4nim");
//         hello("chun");
//         hello("talka");
//     }

//     public static void hello(String name) {
//         System.out.println(name + "さん、こんにちは");
//     }
// }

// public class chapter05 {
//     public static void main(String[] args) {
//         add(100, 20);
//         add(200, 50);
//     }

//     public static void add(int x, int y){
//         int ans=x+y;
//         System.out.println(ans);
//     }
// }

public class chapter05 {
    public static int add(int x,int y){
        int ans=x+y;
        return ans;
    }

    public static void main(String[] args) {
        int ans = add(100, 30);
        System.out.println(ans);
    }
}