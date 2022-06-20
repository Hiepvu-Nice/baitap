import java.util.Scanner;

public class EnumUsed{
protected int data;
    public EnumUsed(int data){
        this.data = data;
    };
   
    
    enum Month {
        JANUARY(31),FEBRUARY(28) ,MARCH(30) , APRIL(31), MAY(30), JUNE(31), JULY(30),AUGUST(31),SEPTEMBER(30),
        OCTOBER(31),NOVEMBER(30),DECEMBER(31);
 
        private  int days;
        public int getDays(){
            return days;
        }
        WeekDay(int days) {
            this.days = days;
        }  
    }
 
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        EnumUsed E = new EnumUsed(a);
      
    }
}

