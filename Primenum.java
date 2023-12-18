package Program1;

import java.util.Scanner;

public class Primenum {
        public static void main(String[] args) {
        Scanner r=new Scanner(System.in);

        int count=0;

        System.out.println("Enter the number");
        int num=r.nextInt();
        if(num==0||num==1){
            System.out.println("Composite number");
        }
        else{
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    
}

