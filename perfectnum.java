package Program1;
import java.util.*;

class perfectnum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=r.nextInt();

        int sum=0,temp=num;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        String res=(sum==temp)?"Perfect number":"Not perfect number";
        System.out.println(res);
    }
}