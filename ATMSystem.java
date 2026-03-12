import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;   // initial balance
        int choice;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();

                    if(withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Remaining Balance: " + balance);
                    } 
                    else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Deposit successful.");
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        sc.close();
    }
}