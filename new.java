import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.0;
        int choice;

        while (true) {
            System.out.println("\nATM Menu");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful. Current balance: ₹" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
