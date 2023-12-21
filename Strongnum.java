package Program1;
import java.util.*;

public class Strongnum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num=r.nextInt();
        int last=0,fact=1,sum=0,temp=num;

        while(num>0){
            last=num%10;
            for(int i=1;i<=last;i++){
                fact*=i;
            }
            sum+=fact;
            fact=1;
            last=0;
            num/=10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
    
}
