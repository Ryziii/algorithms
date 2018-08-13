import java.util.Scanner;

public class ex1_1_15 {
    public static int[] histogram(int[] a,int M){
        int[] b = new int[M];
        for(int i = 0; i < a.length; i++){
            if(a[i] < M)
                b[a[i]]++;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0;i < 5;i++){
            a[i]=sc.nextInt();
        }
        int[] b = histogram(a,5);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
