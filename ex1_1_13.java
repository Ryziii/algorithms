public class ex1_1_13 {
    public static void main(String[] args){
        int[][] a=new int[5][4];
        for(int i=0;i < 5; i++){
            for(int j = 0; j < 4; j++){
                a[i][j]=i+j;
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
