package Internship;
import java.util.Scanner;
public class BankInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="Shabrish";
        double balance=10000.00;
        int option;
        do {
            System.out.println("1:Balance 2:Deposite 3:Withdraw");
            System.out.printf("Enter Your Option : ");
            option=sc.nextInt();
            if(option==1)
            {
                System.out.println(name+" : ");
                System.out.println("Your Balance is : "+balance);
            } else if (option==2) {
                System.out.printf("Enter Your Amount : ");
                int inp=sc.nextInt();
                balance+=inp;
                System.out.println(name+" :  ");
                System.out.println("Your Total balance is : "+ balance);
            } else if (option==3) {
                if(balance==1000)
                {
                    System.out.println("Sorry sir , You Cannot withdraw amount(1000");
                }
                else {
                    System.out.printf("Enter Your Amount : ");
                    int inp=sc.nextInt();
                    balance-=inp;
                    System.out.println(name+" :  ");
                    System.out.println("Your Total balance is : "+ balance);
                 }
            } else if (option==4) {
                break;
            }
            else {
                System.out.println("Please Sir ,Enter Right Option ");
            }

        }while (option !=4);

    }
}
