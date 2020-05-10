package com;

public class Calculator {
    public static int mul(int a, int b){ return a*b; }
    public static int div(int a, int b){
        return a/b;
    }
    public static int add(int a, int b){
        return (a+b);
    }
    public static int sub(int a, int b){ return (a-b); }
    public static int multiply(int a,int b) { return (a*b); }
    public static int dividie(int a,int b){return (a/b)};

    public static void main(String[] args) {
       int choice,result;
        int value1,value2;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("------MENU------");
            System.out.println("1. Addition \n"+
                               "2. Subtraction \n"+
                               "3. Multiplication \n"+
                               "4. Division \n"+
                               "5. Exit \n");
            System.out.println("Please enter your choice :");
            choice=sc.nextInt();

                switch(choice)
                {
                    case 1: System.out.println("Enter the first number");
                            value1=sc.nextInt();
                            System.out.println("Enter the second number");
                            value2=sc.nextInt();
                            result=add(value1,value2);
                            System.out.println(result);
                            break;
                    case 2: System.out.println("Enter the first number");
                            value1=sc.nextInt();
                            System.out.println("Enter the second number");
                            value2=sc.nextInt();
                            result=diff(value1,value2);
                            System.out.println(result);
                            break;
                    case 3: System.out.println("Enter the first number");
                            value1=sc.nextInt();
                            System.out.println("Enter the second number");
                            value2=sc.nextInt();
                            result=multiply(value1,value2);
                            System.out.println(result);
                            break;
		   case 4: System.out.println("Enter the first number");
                            value1=sc.nextInt();
                            System.out.println("Enter the second number");
                            value2=sc.nextInt();
                            result=divide(value1,value2);
                            System.out.println(result);
                            break;
                    case 5: System.out.println("Terminating...PLease wait!!");
                            System.exit(0);
                            break;

                    default:System.out.println("Enter a valid choice!");
                            break;


                }//switch ends

        }
        

    }
}
