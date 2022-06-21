import java.util.Scanner;

public class EnumUsed{

  public enum Month {
        JANUARY(31),FEBRUARY(28) ,MARCH(30) , APRIL(31), MAY(30), JUNE(31), JULY(30),AUGUST(31),SEPTEMBER(30),
        OCTOBER(31),NOVEMBER(30),DECEMBER(31);
 
        private  int days;
        public int getDays(){
            return days;
        }
        Month(int days) {
            this.days = days;
        }  
    }
 static void ReturnDays(int data){
  
      switch(data){
    case 1 :
        System.out.println(Month.JANUARY.getDays());
        break;
    case 2 :
        System.out.println(Month.FEBRUARY.getDays());
        break;
    case 3 :
        System.out.println(Month.MARCH.getDays());
        break;
    case 4 :
        System.out.println(Month.APRIL.getDays());
        break;
    case 5 :
        System.out.println(Month.MAY.getDays());
        break;
    case 6 :
        System.out.println(Month.JUNE.getDays());
        break;
    case 7 :
        System.out.println(Month.JULY.getDays());
        break;
    case 8 :
        System.out.println(Month.AUGUST.getDays());
        break;
    case 9 :
        System.out.println(Month.SEPTEMBER.getDays());
        break;
    case 10 :
        System.out.println(Month.OCTOBER.getDays());
        break;
    case 11 :
        System.out.println(Month.NOVEMBER.getDays());
        break;
    case 12 :
        System.out.println(Month.DECEMBER.getDays());
        break;
    default : 
     System.out.println("Ban da nhap sai:");
}
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Month ma ban muon kiem tra :");
        int a = input.nextInt();
       ReturnDays(a);
       System.out.println("-------End-------:");
    }
}

