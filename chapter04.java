// public class chapter04 {
//     public static void main(String[]args){
//         int[] scores;
//         scores=new int[5];
//         int num =scores.length;
//         System.out.println(num);
//     }
// }

// public class chapter04{
//     public static void main(String[]args){
//         int[] scores={20,30,40,50,80};
//         int sum=scores[0]+scores[1]+scores[2]+scores[3]+scores[4];//添字は0からだよ
//         int avg=sum/scores.length;
//         System.out.println("sum:"+sum);
//         System.out.println("avg:"+avg);
//     }
// }

public class chapter04{
    public static void main(String[]args){
        int[]scores={20,30,40,50,80};
        for (int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }
    }
}