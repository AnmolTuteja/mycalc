package com;

import java.util.Scanner;

public class Calculator {
    public static int mul(int a, int b){ return a*b; }
    public static int div(int a, int b){
        return a/b;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){ return a-b; }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        System.out.println("Enter the operator");
        String op=sc.next();


            switch(op){
                case "*":
                    System.out.println(mul(num1,num2));
                    break;
                case "/":
                    System.out.println(div(num1,num2));
                    break;
                case "+":
                    System.out.println(add(num1,num2));
                    break;
                case "-":
                    System.out.println(sub(num1,num2));
                    break;
                default: System.out.println("Exiting program due to invalid input 1");
            }
        }


    }
