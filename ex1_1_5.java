import java.util.Scanner;
public class ex1_1_5 {
    static Scanner sc = new Scanner(System.in);
    public static boolean cmp(double val){
        return val >=0.0 && val <= 1.0;
    }
    public static void main(String[] args){
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(cmp(a) && cmp(b));
    }
}
