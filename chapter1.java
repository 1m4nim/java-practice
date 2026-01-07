
// public class chapter1{
//     public static void main(String[]args){
//         System.out.println("1m4nim");
//         System.out.println("25歳です");
//         System.out.println(31+31);
//         int x;
//         x=5;
//         System.out.println(x*x);
//     }
// }

public class chapter1{
    public static void main(String[]args){
        final double PI=3.14;
        int pie=5;
        System.out.println(PI*pie*pie);
        PI=10;//PIEはfinalなのでコンパイルエラー
    }
}