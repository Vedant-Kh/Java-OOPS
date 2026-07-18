/*
Q2) Write a Java program that takes an integer N and prints multiplication tables from 1 to N. Each table
should be printed up to 10.
*/

import java.util.*;

public class question {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            for(int j=0;j<10;j++){
                System.out.println(i*j);
            }
            System.out.print("\n");
        }

    }
}
