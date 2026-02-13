package com.conditionals;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        //Find the largest of the three numbers

        int max =a;

        if(max < b){

            max =b;
        }if (max < c){

            max =c;
        }else{
            System.out.println(max + " is the max number.");
        }
    }
}
