/*
Q3) Accept Start and End as input and print all prime numbers in the given range (inclusive).
*/
import java.util.Scanner;

public class question{

    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        for(int i=n;i<m;i++){
            if(i==1 || i==0){
                continue;
            }
            boolean isPrime= true;
            for(int j=2;j<Math.sqrt(i);j++){
                if(i%2==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i);
            }
        }
    }
}
