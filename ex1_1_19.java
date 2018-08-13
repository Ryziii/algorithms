public class ex1_1_19 {
    public static double cln(int n){
        if(n <= 0) return 1;
        else return cln(n-1) * n;
    }
    public static void main(String[] args){
        System.out.println(Math.log(cln(3)));
        System.out.println(cln(4));
    }
}
