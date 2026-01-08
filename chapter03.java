// public class chapter03 {
//     public static void main(String[]args){
//         boolean tenki=true;
//         if(tenki==true){
//             System.out.println("お洗濯！");
//         }else{
//             System.out.println("TV見ます");
//         }
//     }
// }

// public class chapter03{
//     public static void main(String[]args){
//         boolean doorClose=true;
//         while (doorClose==true){
//             System.out.println("まだかなあ");
//         }
//     }
// }

// public class chapter03{
//     public static void main(String[]args){
//         System.out.println("占い");
//         int fortune=1;
//         switch(fortune){
//             case 1:
//                 System.out.println("大吉");
//                 break;
//             case 2:
//                 System.out.println("中吉");
//                 break;
//             case 3:
//                 System.out.println("小吉");
//                 break;
//         }
//     }
// }

// public class chapter03{
//     public static void main(String[]args){
//         System.out.println("サイコロ");
//         int dice=new java.util.Random().nextInt(6)+1;
//         switch (dice){
//             case 1:
//             case 2:
//                 System.out.println("Happy");
//                 break;
//             case 3:
//             case 4:
//                 System.out.println("フツー");
//                 break;
//             case 5:
//             case 6:
//                 System.out.println("bad");
//                 break;
//         }
//     }
// }

// public class chapter03{
//     public static void main(String[]args){
//         for(int i=0;i<10; i++){
//             System.out.println("Hello");
//         }
//     }
// }

public class chapter03{
    public static void main(String[]args){
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.print(i*j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}