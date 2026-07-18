/*
Q4) NUMBER GUESSING GAME 
*/

import java.util.*;
public class question{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=27;

        int i=0;
        while(i<5){
            int n=sc.nextInt();
            if(n==num){
                System.out.println("congratulations ");
                return;
            }
            if(n>27){
                System.out.println("Too high");
            }if(n<27){
                System.out.println("Too low");
            }
            i--;
        }
        System.out.println("the correct number was "+num);
    }
}
