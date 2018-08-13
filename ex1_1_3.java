import java.util.Scanner;
public class ex1_1_3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int val1=sc.nextInt();
        int val2=sc.nextInt();
        int val3=sc.nextInt();
        System.out.println(val1 == val2 && val2 == val3);
    }
}
