// public class chapter02{
//     public static void main(String[]args){
//         float f=3;
//         double d=f;
//         System.out.println(f);//float型の変数にint型を代入したもの
//         System.out.println(d);//double型の変数にfloat型を代入したもの
//     }
// }

// public class chapter02{
//     public static void main(String[]args){
//         int age=(int)3.2;
//         System.out.println(age);
//     }
// }

// public class chapter02{
//     public static void main(String[]args){
//         String name="1m4nim";
//         System.out.print("I'm ");//printlnとは異なり改行しない
//         System.out.print(name);
//     }
// }

// public class chapter02{
//     public static void main(String[]args){
//         int a=5;
//         int b=6;
//         int m=Math.min(a,b);//maxでも行ける
//         System.out.println(m);
//     }
// }

// public class chapter02{
//     public static void main(String[]args){
//         String age="24";
//         int n=Integer.parseInt(age);
//         System.out.println("私は今年で"+(n+1)+"歳になるよ");
//     }
// }

// public class chapter02{
//     public static void main(String[]args){
//         int r = new java.util.Random().nextInt(7);
//         System.out.println("サイコロの目："+r);
//     }
// }

public class chapter02{
    public static void main(String[]args){
        System.out.println("名前を教えて");
        String name= new java.util.Scanner(System.in).nextLine();
        System.out.println("年齢は？");
        int age=new java.util.Scanner(System.in).nextInt();
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}