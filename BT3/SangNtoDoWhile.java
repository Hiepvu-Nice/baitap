import java.lang.Math;

public class SangNtoDoWhile {
    public static void main(String[] args) {
        //Sang Nto
        int[] a = new int[100000];
        for (int i = 2; i <= 10000; i++){ a[i] = 1;}
        a[0] = a[1] = 0;
        for (int i = 2; i <= Math.sqrt(10000); i++){
        if (a[i]==1){
             for (int j = 2 * i; j <= 10000; j += i){
             a[j] = 0;
             }}}   
        
        long sum = 0;
        int i = 0;
        do{
            if(a[i]!=0){
                sum+=i;
            }
            i++;
        }while(i<10000);
        System.out.println(sum);
    }
}
