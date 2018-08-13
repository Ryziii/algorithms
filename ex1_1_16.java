public class ex1_1_16 {
    public static int exR1(int n){
        if(n <= 0) return 0;
        return exR1(n-3) + n + exR1(n-2) + n;
    }
    public static void main(String[] args){
        System.out.println(exR1(4));
    }
}
