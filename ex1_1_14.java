import java.util.Scanner;
import java.math.*;
public class ex1_1_14 {

    public static int lg(int n){
        int a=1;
        for(int i = 0; ;i++){
            a *= 2;
            if(a*2 > n) return i;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(lg(n)+1);
        System.out.println(Math.log(n));
    }
}
