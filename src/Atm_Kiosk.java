import java.util.Scanner;

public class Atm_Kiosk {
   public static void main(String[] args) {
        System.out.println("🙏🏼 Namastute 🙏🏼");

        int pin = 2503;
        Scanner input = new Scanner(System.in);
        int trials = 3;
        int balance = 10_000;
        boolean authenticated = false;
        while (trials>0) {
            System.out.println("Enter your 4-digit pin: ");
            int user_pin = input.nextInt();
            if (user_pin == pin) {
                authenticated = true;
            break;
            }
            else{
                trials--;
                System.out.println("Incorrect pin! Trials remaining: "+trials);
            }
        }
        if (authenticated) {
            while (true) {
                System.out.println("===== COMMUNITY BANK KIOSK =====");
                System.out.println("1. Check Balance\n" +
                        "2. Deposit Money\n" +
                        "3. Withdraw Money\n" +
                        "4. Apply for a Micro-Loan\n" +
                        "5. Exit\n" +
                        "================================\n" +
                        "Choose an option:");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is :" + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to be deposited :");
                        int deposit = input.nextInt();
                        if (deposit > 0) {
                            balance = balance + deposit;
                            System.out.println("New Balance: " + balance);
                        } else System.out.println("Invalid deposit amount !"); break;
                    case 3:
                        System.out.println("Enter amount to be withdrawn :");
                        int wdraw = input.nextInt();
                        if (wdraw <= balance && wdraw > 0) {
                            balance = balance - wdraw;
                        } else System.out.println("Invalid withdrawal amount!");
                        break;

                    case 4:
                        System.out.println("* The bank offers two types of loans *");
                        System.out.println("1. for a Personal Loan\n" +
                                "\n" +
                                "2. for a Business Loan");
                        int loan_input = input.nextInt();
                        switch (loan_input) {
                            case 1:
                                System.out.print("Enter your age :");
                                int age_check = input.nextInt();
                                if(age_check>=18){
                                    System.out.println("Approved for $500!");
                                }
                                else System.out.println("Denied due to age!");
                                break;
                            case 2:
                                System.out.print("Enter your current balance :");
                                int current_balance = input.nextInt();
                                if(current_balance>20000){
                                    System.out.println("Approved for 15000 business loan!");
                                }
                                else System.out.println("Denied due to low collateral!");
                                break;

                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using Community Bank. Goodbye!");
                        System.exit(0); // USED tis from ai didnt know about it
                        break;
                }


            }
        }
        else {
            System.out.println("Account Locked. Ghar jaake sutti babu! ");
        }

    }
}
