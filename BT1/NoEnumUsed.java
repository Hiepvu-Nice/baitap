import java.util.Scanner;

public class NoEnumUsed {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a[] = {31,28,31,30,31,30,31,30,31,30,31,30};
    int k = input.nextInt();
    if(k>=1&&k<=12){
        System.out.println("Thang "+k+" co: "+a[k]+" ngay.");
    }else{
        System.out.println("Ban da nhap sai!");
    }
   }
}
