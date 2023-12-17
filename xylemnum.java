package Program1;
import java.util.*;

public class xylemnum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter The Five Digit Number");
        int num=r.nextInt();
        int last=0,mid=0;
        last=num%10;
        num/=10;
        while(num>9){
            mid+=num%10;
            num/=10;
        }
        int F_L=last+num;
        if(F_L==mid){
            System.out.println("XYLEM NUMBER");
        }
        else{
            System.out.println("NOT XYLEM NUMBER");
        }
    }
    
}
