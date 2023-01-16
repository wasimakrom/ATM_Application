package wasim.com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while(true){
            System.out.println("=====***===== Select Option from here ======***====");
            System.out.println(" 1 . Balance Check");
            System.out.println(" 2 . Deposit ");
            System.out.println(" 3 . Withdraw ");
            System.out.println(" 4 . EXIT ");
            int a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("Your balance is : " + balance);
                    break;

                case 2:
                    System.out.println("Enter your deposit balance  here :  ");
                    int dep = sc.nextInt();
                    balance = dep+balance;
                    System.out.println("Successfully deposit ! " + dep);
                    System.out.println("Current balance is : " + balance);
                    break;

                case 3:
                    System.out.println("Enter your value to withdraw !");
                    int withdraw = sc.nextInt();
                    if(withdraw<balance){
                        System.out.println("Your cash is : "+withdraw);
                        balance = balance-withdraw;
                        break;
                    }
                   else{
                        System.out.println("Insufficient Balance !");
                        break;
                    }

                case 4:
                    System.out.println("You have successfully Exit !!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("You have put wrong values ! Please check and retype thanks for visit ");
                    break;
            }
        }


    }
}
