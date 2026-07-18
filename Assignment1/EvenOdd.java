/*
Q1) Write a Java program that accepts an integer N and prints all numbers from 1 to N. For each
number, print whether it is Even or Odd.
*/

import java.util.*;

public class question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=1;i<=s;i++){
            if(i%2==0){
                System.out.println(i+" -> even");
            }else{
                System.out.println(i+" -> odd");
            }
        }
    }
}
