public class ex1_1_8 {
    public static void main(String[] args){
        System.out.println((char)('a'+4));
        String str="";
        int n=1;
        while(true){
            str = ( n % 2 ) + str;
            n/=2;
            if(n<=0) break;
        }
        System.out.println(str);
    }
}
