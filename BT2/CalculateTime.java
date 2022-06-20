
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateTime {
    public static void main(String[] args) {
    // Input
       int a,b,c,d,e,f;
       Scanner input = new Scanner(System.in);
       System.out.println("First Time(mm xx dd):");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
       System.out.println("Nhap Last Time(mm xx dd):");
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();
    // Xu li Input Time
    LocalDate localDate = LocalDate.now();
    LocalDate Date1 = LocalDate.of(a,b,c);
    LocalDate Date2 = LocalDate.of(d,e,f);
    // Calculate
       long Days = ChronoUnit.DAYS.between(Date2, Date1);
    // Println
        if(Days>0){
          System.out.println(Days);
         }else{
            System.out.println("Wrong data input");
         }
    }
}
